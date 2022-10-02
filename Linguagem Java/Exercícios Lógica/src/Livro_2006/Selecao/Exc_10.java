package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_10 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro valor: ");
        int v1 = sc.nextInt();

        System.out.println("Escreva o segundo valor: ");
        int v2 = sc.nextInt();

        System.out.println("Escreva o terceiro valor: ");
        int v3 = sc.nextInt();

        if (v1 < v2 && v2 < v3) {
            System.out.println("1: " + v1 + " " + v2 + " " + v3);
        } else if (v1 > v2 && v3 > v2) {
            System.out.println("2: " + v2 + " " + v1 + " " + v3);
        } else if (v1 > v2 && v2 > v3) {
            System.out.println("3: " + v3 + " " + v2 + " " + v1);
        } else if (v1 < v2 && v2 > v3) {
            System.out.println("4: " + v3 + " " + v1 + " " + v2);
        }

        sc.close();
    }

}

// 2, 5, 10
// 5, 2, 10
// 10, 5, 2

// 5, 10, 2
