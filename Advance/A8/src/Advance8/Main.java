package Advance8;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        boolean flag=false;
        try
        {
            int x=1000/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            flag=true;
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
            flag=true;
            System.out.println("InputMismatchException");
            e.printStackTrace();
        }
        catch(ArithmeticException e)
        {
            flag=true;
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }
        catch(Exception e)
        {
            flag=true;
            System.out.println("Exception");
            e.printStackTrace();
        }
        finally
        {
            if(flag)
                System.out.println("Exception catched");
            else
                System.out.println("No Exceptions catched");
        }
    }
}
