import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Theon {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        Integer[] algozes = new Integer[N];

        for (int count = 0; count < N; count++) {
            algozes[count] = leitor.nextInt();
        }
        int posMenor = (Collections.min(Arrays.asList(algozes)));

        System.out.println((Arrays.asList(algozes).indexOf(posMenor))+1);
    }
}

