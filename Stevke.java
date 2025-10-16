import java.util.Scanner;

public class Stevke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        while (a > 0) {
            long digit = a % 10; // ostanek pri deljenju z 10 je prva števka
            System.out.println(digit); // ta ostanek izpišemo
            a /= 10; // nato število a delimo z 10, dobimo novo celo število (celo / celo = celo), ki je brez zadnje števke
        }

        sc.close();
    }
}
