import java.util.*;

import javax.lang.model.util.ElementScanner14;

class FirstClass {
    public static void main(String args[]) {
        System.out.print("Welcome in Java Programming \n");
        System.out.println("Hello Wrold");
        System.out.println("*\n**\n***\n****");

        // Variables + Datatype
        int a = 20;
        int b = 30;
        int s = a + b;
        System.out.println(s);

        // Input
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);
        // nextInt()
        // nextFloat()

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

        System.out.println("******** Enter Radius of Circle  **********");

        double r = sc.nextFloat();
        double area = 2 * 3.142 * r;

        System.out.println("Area of Circle is : " + area);

        // Print Table without using loop
        System.out.println("2" + ' ' + "x" + ' ' + '1' + ' ' + "=" + ' ' + (2 * 1));
        System.out.println("2" + ' ' + "x" + ' ' + '2' + ' ' + "=" + ' ' + (2 * 2));
        System.out.println("2" + ' ' + "x" + ' ' + '3' + ' ' + "=" + ' ' + (2 * 3));
        System.out.println("2" + ' ' + "x" + ' ' + '4' + ' ' + "=" + ' ' + (2 * 4));
        System.out.println("2" + ' ' + "x" + ' ' + '5' + ' ' + "=" + ' ' + (2 * 5));
        System.out.println("2" + ' ' + "x" + ' ' + '6' + ' ' + "=" + ' ' + (2 * 6));
        System.out.println("2" + ' ' + "x" + ' ' + '7' + ' ' + "=" + ' ' + (2 * 7));
        System.out.println("2" + ' ' + "x" + ' ' + '8' + ' ' + "=" + ' ' + (2 * 8));
        System.out.println("2" + ' ' + "x" + ' ' + '9' + ' ' + "=" + ' ' + (2 * 9));
        System.out.println("2" + ' ' + "x" + ' ' + "10" + ' ' + "=" + ' ' + (2 * 10));

        // Marks sheet Programm
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Adult");
        } else if (age >= 18 & age <= 30) {
            System.out.println("Young");
        } else if (age >= 30 & age <= 45) {
            System.out.println("Midle Age");
        } else if (age >= 45) {
            System.out.println("Your Are Old Person");
        }

        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Syntax");
        }

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid Syntax");
                break;
        }

        // Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
        }

    }
}