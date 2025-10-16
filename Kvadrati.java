// ./tj.exe {file_name} . .
import java.util.Scanner;

public class Kvadrati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a <= b) { // dokler je a manjši oz. enak b, izpisuj kvadrate števila a
            System.out.println(a * a);
            a++;
        }

        sc.close();
    }
}
