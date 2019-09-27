
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneClockTest {

    private PhoneClock phone;
    private CityClock [] temp;

    @BeforeEach
    void init(){
        phone = new PhoneClock();
        temp = new CityClock[5];
    }
    @Test
    @DisplayName("时钟全为时间0的测试")
    void updateAutoZero() {

        temp[0] = new CityClock("Sydney",0,10);
        temp[1] = new CityClock("Beijing",0,8);
        temp[2] = new CityClock("Moscow",0,4);
        temp[3] = new CityClock("London",0,0);
        temp[4] = new CityClock("NewYork",0,-5);
        phone.setPhoneTime(0);
        phone.updateAuto(temp);
        for(CityClock ccs : temp)
        {
            assertEquals(phone.phoneTime + ccs.timeDifference,ccs.cityTime);
        }


    }

    @Test
    @DisplayName("时钟时间随机的测试")
    void updateAutoRandom(){ //时间不确定的测试

        temp[0] = new CityClock("Sydney",1,10);
        temp[1] = new CityClock("Beijing",2,8);
        temp[2] = new CityClock("Moscow",3,4);
        temp[3] = new CityClock("London",4,0);
        temp[4] = new CityClock("NewYork",5,-5);
        phone.setPhoneTime(14);
        phone.updateAuto(temp);
        for(CityClock ccs : temp)
        {
            assertEquals(phone.phoneTime + ccs.timeDifference,ccs.cityTime);
        }
    }


}