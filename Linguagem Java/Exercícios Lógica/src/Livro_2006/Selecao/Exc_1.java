package Livro_2006.Selecao;

import java.util.Scanner;

// Optei pelo Switch ao invés do If Else
public class Exc_1 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo de origem do produto: ");
        int cod = sc.nextInt();

        switch (cod) {
            case 1:
                System.out.println("O codigo e referente a regiao Sul");
                break;
            case 2:
                System.out.println("O codigo e referente a regiao Norte");
                break;
            case 3:
                System.out.println("O codigo e referente a regiao Leste");
                break;
            case 4:
                System.out.println("O codigo e referente a regiao Oeste");
                break;
            case 5:
            case 6:
                System.out.println("O codigo e referente a regiao Nordeste");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("O codigo e referente a regiao Sudeste");
                break;
            case 10:
                System.out.println("O codigo e referente a regiao Centro-Oeste");
                break;
            case 11:
                System.out.println("O codigo e referente a regiao Noroeste");
                break;
            default:
                System.out.println("Produto importado");
                break;
        }

        sc.close();

    }

}
