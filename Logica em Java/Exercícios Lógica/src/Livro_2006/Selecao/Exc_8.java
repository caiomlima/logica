package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_8 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoN = sc.nextInt();

        int ano = 2021 - anoN;

        if (ano >= 16) {
            System.out.println("Pode votar");
        } else{
            System.out.println("Nao pode votar");
        }

        sc.close();

    }

}
