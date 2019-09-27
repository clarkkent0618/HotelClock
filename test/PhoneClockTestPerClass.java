import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PhoneClockTestPerClass {

    private PhoneClock phone;
    private CityClock [] temp;

    @BeforeEach
    void init(){
        phone = new PhoneClock();
        temp = new CityClock[5];
    }
    @Test
    void updateAutoZero() {  //时钟全为时间0的测试

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
