import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args)
    {
        UTCtime utctime = new UTCtime(0); //假设标准时间为0，方便起见
        PhoneClock phoneClock = new PhoneClock();

        CityClock [] cityClocks = new CityClock[5]; //假设所有时钟的时间都初始化为0
        cityClocks[0] = new CityClock("Sydney",0,10);
        cityClocks[1] = new CityClock("Beijing",0,8);
        cityClocks[2] = new CityClock("Moscow",0,4);
        cityClocks[3] = new CityClock("London",0,0);
        cityClocks[4] = new CityClock("NewYork",0,-5);

        System.out.println("输入数字1开始自动调时");
        Scanner in = new Scanner(System.in);
        String aws = in.nextLine();

        if(aws.equals("1"))
        {
            phoneClock.setPhoneTime(utctime.UtcTime); //服务员手机设置为标准时间
            phoneClock.updateAuto(cityClocks); //自动开始调时
        }


    }
}
