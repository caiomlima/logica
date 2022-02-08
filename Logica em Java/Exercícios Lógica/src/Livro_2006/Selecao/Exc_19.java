package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_19 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int v1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int v2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int v3 = sc.nextInt();

        if (v1 > v2 && v3 > v2) {
            System.out.println("Os maiores valores sao: 1 e 3, sendo o valor final: " + (v1 + v3));
        } else if (v2 > v1 && v3 > v1) {
            System.out.println("Os maiores valores sao: 2 e 3, sendo o valor final: " + (v2 + v3));
        } else if (v1 > v3 && v2 > v3) {
            System.out.println("Os maiores valores sao: 1 e 2, sendo o valor final: " + (v1 + v2));
        }
        sc.close();

    }

}

// 1 3 5
// 3 5 1
// 3 1 5

