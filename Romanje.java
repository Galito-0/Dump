import java.util.Scanner;

public class Romanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt(); // dolžina poti
        int p = sc.nextInt(); // prehojenost prvi dan
        int z = sc.nextInt(); // utrujenost (p - z vsak dan)

        // while ((p - z > 0) && (d >= 0) ) {
        //     int i = 1;
        //     System.out.println(i + ": " + z + "->" + )
        // }

        System.out.println("1:" + d + "->" + (d-p)); // prvi dan

        // do {
        //     int i = 1; // število dneva
        //     System.out.println(i + ": " + d + "->" + (d-p));
        //     d -= p; // vsak dan se prehojena razdalja zmanjša za p
        //     p -= z; // 
        //     i++; // vsakič naslednji dan
        // } while ((p - z >= 0) && (d >= 0));

        while ((p - z > 0) && (d >= 0)) {
            
        }


        sc.close();
    }
}
