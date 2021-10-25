package Advance12;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Employee[] arr;
    static {
        arr=new Employee[1];
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/home/knoldus/Desktop/Java/A12/Employee.txt");
        //READING FROM FILE
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        System.out.println("Employee Details Currently inside Employee.txt: ");
        while((st=br.readLine())!=null)
        {
            String[] temp=st.trim().split("\\,");

            //STORING INSIDE EMPLOYEE OBJECT
            Employee emp=new Employee(Integer.parseInt(temp[0]),temp[1],Integer.parseInt(temp[2]));
            arr[0]=emp;
        }
        br.close();
        //DISPLAYING OBJECT CONTENT
        System.out.println(arr[0]);



        //WRITING NEW CONTENT TO FILE
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter new details of Employee to be present inside Employee.txt: ");
        System.out.print("Enter ID : ");
        String id=sc.nextLine();
        System.out.print("\nEnter Name : ");
        String name=sc.nextLine();
        System.out.print("\nEnter Age : ");
        int age=Integer.parseInt(sc.nextLine());

        String text=id+","+name+","+age;
        FileWriter fw=new FileWriter(file);
        fw.write(text);
        fw.flush();
        fw.close();




        //DISPLAYING NEW CONTENT OF Employee.txt
        br = new BufferedReader(new FileReader(file));
        System.out.println("\nNew Employee Details inside Employee.txt: ");
        while((st=br.readLine())!=null)
        {
            System.out.println(st);
        }
    }
}


