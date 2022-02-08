package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_11 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha do banco super secreto que contem segredos secretamente secretos");
        int senha = sc.nextInt();

        if (senha != 1234) {
            System.out.println("ACESSO NEGADO");
        } else {
            System.out.println("ACESSO PERMITIDO");
        }
        sc.close();

    }

}
