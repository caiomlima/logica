package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("Opc 1: " + num1 + " " + num2 + " " + num3);
        } else if (num1 < num2 && num2 < num3 ) {
            System.out.println("Opc 2: " + num3 + " " + num2 + " " + num1);
        } else if (num1 < num2 && num2 > num3) {
            System.out.println("Opc 3: " + num2 + " " + num3 + " " + num1);
        }
        sc.close();

    }

}
// 5 3 1
// 1 3 5
// 1 5 3

