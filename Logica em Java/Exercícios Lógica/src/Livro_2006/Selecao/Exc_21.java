package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_21 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida do primeiro lado do triangulo: ");
        int l1 = sc.nextInt();

        System.out.println("Digite a medida do segundo lado do triangulo: ");
        int l2 = sc.nextInt();

        System.out.println("Digite a medida do terceiro lado do triangulo: ");
        int l3 = sc.nextInt();

        if (l1 == l2 && l2 == l3 && l3 == l1) {
            System.out.println("Triangulo Equilatero: possui os 3 lados iguais");
        } else if (l1 == l2 || l2 == l3 || l3 == l1) {
            System.out.println("Triangulo Isosceles: possui 2 lados iguais");
        } else if (l1 != l2 && l2 != l3 && l3 != l1) {
            System.out.println("Triangulo Escaleno: possui 3 lados diferentes");
        }
        sc.close();

    }

}
