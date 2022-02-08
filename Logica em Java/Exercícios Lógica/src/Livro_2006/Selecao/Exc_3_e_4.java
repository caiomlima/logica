package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_3_e_4 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da avaliacao 1: ");
        int a1 = sc.nextInt();

        System.out.println("Digite a nota da avaliacao 2: ");
        int a2 = sc.nextInt();

        int media = (a1 + a2) / 2;

        if (media >= 6) {
            System.out.println("Parabens, voce foi aprovado com uma nota de: " + media);
        } else {
            System.out.println("Infelizmente voce foi reprovado com uma nota de: " + media);
        }

        sc.close();

    }

}
