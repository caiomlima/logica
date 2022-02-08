package Livro_2006.Selecao;

import java.util.Scanner;

public class Exc_14 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de gols marcado pelo Gremio: ");
        int gG = sc.nextInt();

        System.out.println("Digite o numero de gols marcados pelo Inter: ");
        int gI = sc.nextInt();

        if (gG > gI) {
            System.out.println("Gremio Ganhou");
        } else if (gI > gG) {
            System.out.println("Inter Ganhou");
        } else {
            System.out.println("Empate");
        }
        sc.close();

    }

}
