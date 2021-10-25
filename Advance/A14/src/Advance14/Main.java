package Advance14;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Name> names = new Vector<Name>();
        while (true) {
            System.out.println("<----Press one of the following options---->");
            System.out.println("4. accept first name and surname");
            System.out.println("5. display total name");
            System.out.println("6. exit");
            System.out.print("Enter option number : ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 4) {
                System.out.print("Enter FirstName : ");
                String firstName = sc.nextLine();
                System.out.print("Enter LastName : ");
                String lastName = sc.nextLine();
                Name tempName = new Name(firstName, lastName);
                names.add(tempName);
            } else if (choice == 5) {
                if (names.size() == 0) {
                    System.out.println("No names inside Vector");
                } else {
                    System.out.println("All the names entered are : ");
                    for (Name name : names) {
                        System.out.println(name);
                    }
                }
            } else if (choice == 6)
                break;
            else
                System.out.println("Enter correct option");
        }
    }
}