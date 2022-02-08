package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_5_e_6 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao validador de numeros\n");
        System.out.println("Digite um numero para saber se e positivo, negativo ou neutro (0)");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("O numero digitado e neutro");
        } else if (n >= 1) {
            System.out.println("O numero digitado e positivo");
        } else {
            System.out.println("O numero digitado e negativo");
        }

        sc.close();

    }

}
