package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_15_e_16 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados do poligono regular: ");
        int lP = sc.nextInt();

        System.out.println("Digite a medida do poligono regular em cm: ");
        int mP = sc.nextInt();

        // switch (lP) {
        //     case 1, 2 -> System.out.println("Nao e um poligono");
        //     case 3 -> System.out.println("E um triangulo, e o valor de seu perimetro e: " + (mP + mP + mP));
        //     case 4 -> System.out.println("E um quadrado, e valor de sua area e: " + (mP + mP));
        //     case 5 -> System.out.println("E um Pentgono");
        //     default -> System.out.println("Poligono nao identificado");
        // }
        sc.close();
    }

}
