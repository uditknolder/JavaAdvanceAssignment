package AQues9.P;

import AQues9.P1.TwoDim;
import AQues9.P2.ThreeDim;

public class Main
{
    public static void main(String[] args)
    {
        TwoDim obj=new TwoDim(2.3,4.5);
        System.out.println(obj.toString());
        System.out.println("\n\n");



        System.out.println("Dynamic method dispatch");
        obj=new ThreeDim(2.3,4.5,5.6);
        System.out.println(obj.toString());
    }
}

