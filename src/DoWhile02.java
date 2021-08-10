import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        int val;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введи 5");
            val = scan.nextInt();
        }while (val!=5);
        System.out.println("Вы ввели 5");

    }
}
