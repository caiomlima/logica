package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_7 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O numero 1 e o maior numero");
        } else {
            System.out.println("O numero 2 e o maior numero");
        }

        sc.close();

    }

}
