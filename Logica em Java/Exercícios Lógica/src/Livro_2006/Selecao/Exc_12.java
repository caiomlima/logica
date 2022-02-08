package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_12 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vc se identifica com o sexo feminino ou masculino ?");
        char s = sc.next().charAt(0);

        System.out.println("Digite a sua altura: ");
        double a = sc.nextDouble();

        if (s == 'm' || s == 'M') {
            System.out.println("O seu peso ideal é: " + ((72.7 * a) - 58));
        } else if (s == 'f' || s == 'F'){
            System.out.println("O seu peso ideal é: " + ((62.1 * a) - 44.7));
        }
        sc.close();

    }

}
