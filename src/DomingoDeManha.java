import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);

                if (hora==7)
                    System.out.printf("Atraso maximo: " + min+"\n");
                if(hora==8)
                    System.out.printf("Atraso maximo: " + (60 + min)+"\n");
                if(hora==9)
                    System.out.printf("Atraso maximo: " + (120 + min)+"\n");
                else if (hora!=7 && hora!=8 && hora !=9)
                    System.out.printf("Atraso maximo: 0"+"\n");

        }

    }
}
