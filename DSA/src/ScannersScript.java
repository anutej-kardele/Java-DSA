import java.util.Scanner;

public class ScannersScript {

    public static void main(String[] args){

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println("Entered number - " + val);

        System.out.println("Enter string");
        String val2 = sc.next();
        System.out.println("Enter string - " + val2);

        System.out.println("Enter char");
        char val3 = sc.next().charAt(0);
        System.out.println("Enter char - " + val3);

    }
}
