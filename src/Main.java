import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer value that is greater than or equal to 1000:    ");
        int input = scan.nextInt();

        if (input >= 1000) {

            System.out.println("thanks for the number!!");
            if (input % 30 == 0) { System.out.println("this number is divisible by 30!!!");
            }
            else System.out.println("this is not divisible by 30!!!");
    }
        else System.out.println("error");
    }
}

