package task_clone;

import task_clone.models.SkyNet;
import task_clone.models.Terminator;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Calendar calendar = new GregorianCalendar(1997,7,04);
        Date birthdaySkyNet = calendar.getTime();
        SkyNet skyNet = new SkyNet(birthdaySkyNet);

        Terminator t800 = new Terminator("T800", 2029, skyNet);
        System.out.println(t800);

        Terminator clone = t800.clone();
        System.out.println(clone);
        System.out.println("Clone was done");

        calendar.set(2017, 7, 04);
        birthdaySkyNet = calendar.getTime();
        skyNet.setBirthday(birthdaySkyNet);
        System.out.println(t800);
        System.out.println(clone);


    }
}
