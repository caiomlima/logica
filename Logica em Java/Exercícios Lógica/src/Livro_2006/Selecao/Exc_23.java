package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_23 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o valor do primeiro angulo: ");
        int a1 = sc.nextInt();

        System.out.println("Escreva o valor do segundo angulo: ");
        int a2 = sc.nextInt();

        System.out.println("Escreva o valor do terceiro angulo: ");
        int a3 = sc.nextInt();

        int medida = a1 + a2 + a3;

        if (medida == 90) {
            System.out.println("Triangulo Retangulo: possui um angulo reto. (igual a 90º)");
        } else if (medida > 90) {
            System.out.println("Triangulo Obtusangulo: possui um angulo obtuso. (maior que 90º)");
        } else if (medida < 90) {
            System.out.println("Tri1ngulo Acut1ngulo: possui tres angulos agudos. (menor que 90º)");
        }
        sc.close();
    }

}
