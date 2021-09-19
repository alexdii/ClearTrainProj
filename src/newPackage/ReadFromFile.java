package newPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main (String[] args) throws FileNotFoundException {
        String separator = File.separator;                 // разделитель
        String path = separator + "Users" + separator + "aleks" + separator + "Desktop" + separator + "Test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");    // разбить по пробелу
        int [] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        Scanner close;

    }
}
