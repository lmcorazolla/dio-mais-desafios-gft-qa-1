import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            String[] relogio = leitor.nextLine().split(":");
//            System.out.println(relogio[0]+relogio[1]);
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);

                if (hora==7)
                    System.out.println("Atraso maximo: " + min);
                if(hora==8)
                    System.out.println("Atraso maximo: " + (60 + min));
                if(hora==9)
                    System.out.println("Atraso maximo: " + (120 + min));
                else if (hora!=7 && hora!=8 && hora !=9)
                    System.out.println("Atraso maximo: 0");

        }

    }
}
