package Livro_2006.Simples;

import java.util.Scanner;

public class Exc_1 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo em metros: ");
        int r = sc.nextInt();

        double a = Math.PI * (r * r);

        System.out.println("O raio do circulo e: " + a);
        sc.close();

    }

}
