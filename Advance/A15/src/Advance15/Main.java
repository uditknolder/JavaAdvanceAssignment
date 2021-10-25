package Advance15;
import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file =new File("/home/knoldus/Desktop/Java/A15");
        DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("Last Modified Time "+sdf.format(file.lastModified()));
    }
}

