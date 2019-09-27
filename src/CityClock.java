public class CityClock {
    protected String cityName;
    protected int cityTime; //时钟当前时间
    protected int timeDifference; //地区时差

    public CityClock(){}
    public CityClock(String name,int time,int difference)
    {
        this.cityName = name; //城市的名称
        this.cityTime = time; //为方便起见，时间直接设置为整数，能够表现时差即可。
        this.timeDifference = difference;
    }
    public String getCityName()
    {
        return cityName;
    }
    public void setCityTime(int time)
    {
        this.cityTime = time;
    }
    public int getCityTime()
    {
        return cityTime;
    }
    public void updateTime(int UtcTime)
    {
        this.cityTime = UtcTime + this.timeDifference;
    }
}
