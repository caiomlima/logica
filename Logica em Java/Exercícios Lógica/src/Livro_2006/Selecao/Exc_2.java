package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_2 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avaliacao: ");
        int a1 = sc.nextInt();

        System.out.println("Digite a nota da segunda avaliacao: ");
        int a2 = sc.nextInt();

        System.out.println("Digite a nota da avaliacao optativa: ");
        int aOp = sc.nextInt();

        if (aOp > a1) {
            System.out.println("Sua nota final onde a avaliacap op. substituiu a avaliacao 1 foi: " + ((aOp + a2) / 2));
        } else if (aOp > a2){
            System.out.println("Sua nota final onde a avaliacap op. substituiu a avaliacao 2 foi: " + ((aOp + a1) / 2));
        } else {
            int nAOP = 1;
            System.out.println("Sua nota final sem ter feito a avaliacap op. foi: " + ((a1 + a2 + nAOP) / 2));
        }

        sc.close();
    }

}
