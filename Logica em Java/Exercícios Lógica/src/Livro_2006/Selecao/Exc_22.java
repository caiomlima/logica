package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_22 {

    public static  void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem: ");
        int h1 = sc.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        int h2 = sc.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        int m1 = sc.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        int m2 = sc.nextInt();

        if (h1 < h2 && m1 < m2) {
            System.out.println("Opc 1: ");
            System.out.println("A soma da idade do homem mais velho e a idade da mulher mais nova e: " + (h2 + m1));
            System.out.println("O produto da idade do homem mais novo com a idade da mulher mais velha e: " + (h1 * m2));
        } else if (h1 > h2 && m1 > m2) {
            System.out.println("Opc 2: ");
            System.out.println("A soma da idade do homem mais velho e a idade da mulher mais nova e: " + (h1 + m2));
            System.out.println("O produto da idade do homem mais novo com a idade da mulher mais velha e: " + (h2 * m1));
        } else if (h1 > h2 && m1 < m2) {
            System.out.println("Opc 3: ");
            System.out.println("A soma da idade do homem mais velho e a idade da mulher mais nova e: " + (h1 + m1));
            System.out.println("O produto da idade do homem mais novo com a idade da mulher mais velha e: " + (h2 * m2));
        } else if (h1 < h2 && m1 > m2) {
            System.out.println("Opc 4: ");
            System.out.println("A soma da idade do homem mais velho e a idade da mulher mais nova e: " + (h2 + m2));
            System.out.println("O produto da idade do homem mais novo com a idade da mulher mais velha e: " + (h1 * m1));
        }
        sc.close();

    }

    // H: 20 - 30 || M: 20 - 30 (h2 - m1)
    // H: 30 - 20 || M: 30 - 20 (h1 - m2)
    // H: 30 - 20 || M: 20 - 30 (h1 - m1)
    // H: 20 - 30 || M: 30 - 20 (h2 - m2)

}
