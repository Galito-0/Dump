import java.util.Scanner;
@SuppressWarnings("unused")

public class Ana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        int kombinacij = 0;

        for (int a = 1; a < 10; a += 2) {
            for (int b = m + 1; b < 10; b++) {
                for (int c = 0; c < 10; c++)
                    if (c % d == 0) {
                        System.out.println(a + "-" + b + "-" + c);
                        kombinacij++;
                    }
            }
        }

        System.out.println(kombinacij);

        sc.close();
    }
}

// a ... liho število (vsakič +2)
// b ... m + 1, torej od m+1 do 10
// c ... deljivo z d, torej vsakič preverimo če c % d == 0, če ne c++