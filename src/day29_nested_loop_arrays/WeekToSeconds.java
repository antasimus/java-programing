package day29_nested_loop_arrays;
import java.util.*;
public class WeekToSeconds {
    public static void main(String[] args) {
        int sec=0,min=0,hour=0;
        for (int week=0;week<4;week++)
            for(int day=0;day<=7;day++)
                for(hour=0;hour<24;hour++)
                    for (min = 0; min < 60; min++)
                        for(sec=0;sec<60;sec++) {
                            String time="WEEK "+week+" DAY "+day+"   "+hour+":"+min+":"+sec;
                            System.out.println(time);
                            //Thread.sleep(1000);
                        }

    }
}

