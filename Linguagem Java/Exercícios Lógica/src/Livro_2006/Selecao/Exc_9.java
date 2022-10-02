package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_9 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas macas vai querer: ");
        int qtd = sc.nextInt();

        if (qtd <= 11) {
            System.out.println("O total das " + qtd + " macas foi de R$" + (qtd * 0.25));
        } else {
            System.out.println("O total das " + qtd + " macas foi de R$" + (qtd * 0.30));
        }

        sc.close();

    }

}
