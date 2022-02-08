package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_17 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        int v1 = sc.nextInt();

        System.out.println("Digite o valor 2: ");
        int v2 = sc.nextInt();

        System.out.println("Digite quais das seguintes operações vc deseja fazer:");
        System.out.println("1 - ADICAO | 2 - SUBTRACAO | 3 - DIVISAO | 4 - MULTIPLICACAO");
        int opc = sc.nextInt();

        // switch (opc) {
        //     case 1 -> System.out.println("O resultado da soma e: " + (v1 + v2));
        //     case 2 -> System.out.println("O resultado da subtracao e: " + (v1 - v2));
        //     case 3 -> System.out.println("O resultado da divisao e: " + (v1 / v2));
        //     case 4 -> System.out.println("O resultado da multiplcacao e: " + (v1 * v2));
        //     default -> System.out.println("OPCAO NAO ENCONTRADA");
        // }
        sc.close();
    }
}
