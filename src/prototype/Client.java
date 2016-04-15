package prototype;

import java.util.Random;

/**
 * Created by test on 16/4/15.
 * 场景类
 */
public class Client {
    // 发送账单的数量，这个值应该是从数据库中获取的，现在仅为模拟
    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        // 模拟发送邮件
        int i = 0;
        // 定义原型
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while(i < MAX_COUNT) {
            // 一下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandomString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandomString(5) + "@" + getRandomString(8) + ".com");
            // 发送邮件
            sendMail(cloneMail);
            i++;
        }

        // 使用原型模式，能够保证线程安全
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                // 定义原型
                Mail mail = new Mail(new AdvTemplate());
                mail.setTail("XX银行版权所有");
                while(i < MAX_COUNT) {
                    // 一下是每封邮件不同的地方
                    Mail cloneMail = null;
                    try {
                        cloneMail = mail.clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    cloneMail.setAppellation(getRandomString(5) + " 先生(女士)");
                    cloneMail.setReceiver(getRandomString(5) + "@" + getRandomString(8) + ".com");

                    // 有同步问题
                    synchronized (mail.getClass()) {
                        Thread currentThread = Thread.currentThread();
                        System.out.print(currentThread.getName() + "\t" + "第" + (i + 1) + "封\t");
                        // 发送邮件
                        sendMail(cloneMail);
                    }
                    i++;
                }
            }
        };
        // 模拟多个线程发送
        for(int j = 0; j < MAX_COUNT; j++) {
            Thread thread1 = new Thread(runnable);
            thread1.start();
        }
    }

    // 发送邮件
    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() + "\t...发送成功！");
    }

    // 获取指定长度的随机字符串
    private static String getRandomString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < maxLength; i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
