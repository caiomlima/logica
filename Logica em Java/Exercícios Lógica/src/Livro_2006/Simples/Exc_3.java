package Livro_2006.Simples;

import java.util.Scanner;

public class Exc_3 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tempratura em graus celcius: ");
        int c = sc.nextInt();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura em graus fahrenheit e: " + f);
        sc.close();

    }

}
