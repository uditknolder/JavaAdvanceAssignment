package Advance13;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Random random=new Random();
                int n=random.nextInt(1000);
                System.out.println("Random Integer Generated : "+n);
                if(n%2==0)
                {
                    Square obj=new Square(n);
                    obj.run();
                }
                else
                {
                    Cube obj=new Cube(n);
                    obj.run();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

}
