package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by test on 16/3/25.
 * 场景类
 */
public class Client {
    public static void main(String[] args) throws IOException{
        System.out.println("-----H1型号悍马-----");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要   1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HumerH1Model h1 = new HumerH1Model();
        if("0".equals(type)) {
            h1.setAlarmFlag(false);
        }
        h1.run();

        System.out.println("-----H2型号悍马-----");
        HumerH2Model h2 = new HumerH2Model();
        h2.run();
    }

}
