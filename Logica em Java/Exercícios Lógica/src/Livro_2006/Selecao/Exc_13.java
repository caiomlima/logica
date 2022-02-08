package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_13 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("O numero e par");
        } else {
            System.out.println("O numero e impar");
        }
        sc.close();

    }

}
