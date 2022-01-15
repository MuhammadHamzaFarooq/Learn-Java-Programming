import java.util.*;

class FirstClass{
    public static void main(String args[]){
        System.out.print("Welcome in Java Programming \n");
        System.out.println("Hello Wrold");
        System.out.println("*\n**\n***\n****");

        // Variables + Datatype
        int a = 20;
        int b =30;
        int s = a + b ;
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

        
    }
}