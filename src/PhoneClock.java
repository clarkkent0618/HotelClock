public class PhoneClock {
    public int phoneTime;
    public void setPhoneTime(int time)
    {
        this.phoneTime = time;
    }

    public void updateAuto(CityClock cCs[])
    {
        for(CityClock ccs:cCs) //各时钟开始根据时差自动调整时间
        {
            ccs.updateTime(this.phoneTime);
        }
        System.out.println("时间调整完毕！\n当前各地时间为：\n");
        for(CityClock ccs:cCs)
        {
            System.out.println(ccs.cityName+"时钟当前时间为："+ccs.cityTime);
        }
    }
}
