import java.util.Scanner;

public class ForNomes {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nColetor de nomes - Digite 5 nomes para serem guardados no sistema");

        String nomes[] = new String[5];

        for(int i = 0; i <= 4; i++) {
            System.out.print("\nDigite o " + (i+1) + "° nome: ");
            nomes[i] = sc.next();
        }

        System.out.println("\n\nOs 5 nomes digitados foram:");
        for(int i = 0; i <= 4; i++) {
            System.out.println(nomes[i]);
        }

        sc.close();

    }
    
}
