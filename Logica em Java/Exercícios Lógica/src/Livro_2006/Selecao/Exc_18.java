package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_18 {

    public static void main(String[]args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int v1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int v2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int v3 = sc.nextInt();

        if (v1 > v2 && v1 > v3) {
            System.out.println("O primeiro valor e o maior");
        } else if (v2 > v1 && v2 > v3) {
            System.out.println("O segundo valor e o maior");
        } else if (v3 > v1 && v3 > v2) {
            System.out.println("O terceiro valor e o maior");
        }
        sc.close();
    }

}
