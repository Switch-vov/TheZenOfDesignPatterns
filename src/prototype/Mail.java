package prototype;

/**
 * Created by test on 16/4/15.
 * 邮件类
 */
public class Mail implements Cloneable{
    // 收信人
    private String receiver;
    // 邮件名称
    private String subject;
    // 称谓
    private String appellation;
    // 邮件内容
    private String context;
    // 邮件尾部
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        // 获取广告信的模板的东西
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }


    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            // 成员变量都是String类型，不需要进行深拷贝
            // 只有基本类型和不可变对象才不需要深拷贝
            // 数组和引用对象(不是不可变对象)需要深拷贝
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    // 设置器和获取器

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
