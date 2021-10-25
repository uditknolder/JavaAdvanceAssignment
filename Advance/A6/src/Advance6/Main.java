package Advance6;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/knoldus/Desktop/Java/A6/MidtermScore.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        int range0to9=0,range10to19 = 0,range20to29 = 0,range30to39 = 0,range40to49 = 0,range50to59 = 0,range60to69 = 0,range70to79 = 0,range80to89 = 0
                ,range90to99 = 0,range100=0;
        while((st=br.readLine())!=null)
        {
            int x=Integer.parseInt(st);
            if(x>=0 && x<=9)
                range0to9++;
            else if(x>=10 && x<=19)
                range10to19++;
            else if(x>=20 && x<=29)
                range20to29++;
            else if(x>=30 && x<=39)
                range30to39++;
            else if(x>=40 && x<=49)
                range40to49++;
            else if(x>=50 && x<=59)
                range50to59++;
            else if(x>=60 && x<=69)
                range60to69++;
            else if(x>=70 && x<=79)
                range70to79++;
            else if(x>=80 && x<=89)
                range80to89++;
            else if(x>=90 && x<=99)
                range90to99++;
            else if(x==100)
                range100++;
        }


        System.out.print("00 to 09 : ");
        for(int i=0;i<range0to9;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("10 to 19 : ");
        for(int i=0;i<range10to19;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("20 to 29 : ");
        for(int i=0;i<range20to29;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("30 to 39 : ");
        for(int i=0;i<range30to39;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("40 to 49 : ");
        for(int i=0;i<range40to49;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("50 to 59 : ");
        for(int i=0;i<range50to59;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("60 to 69 : ");
        for(int i=0;i<range60to69;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("70 to 79 : ");
        for(int i=0;i<range70to79;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("80 to 89 : ");
        for(int i=0;i<range80to89;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("90 to 99 : ");
        for(int i=0;i<range90to99;i++)
            System.out.print("*");
        System.out.println();

        System.out.print("100 : ");
        for(int i=0;i<range100;i++)
            System.out.print("*");
        System.out.println();


    }
}

