import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;


        A = Double.parseDouble(sc.next());
        B = Double.parseDouble(sc.next());

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = " +String.format("%.5f", media));
        System.out.println();

    }

}
