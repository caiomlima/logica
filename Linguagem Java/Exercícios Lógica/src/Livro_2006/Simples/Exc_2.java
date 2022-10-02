package Livro_2006.Simples;

import java.util.Scanner;

public class Exc_2 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura em graus Fahrenheit: ");
        int f = sc.nextInt();

        double c = (f - 32) / 1.8;

        System.out.println("A temperatura em graus celcius e: " + c);
        sc.close();

    }

}
