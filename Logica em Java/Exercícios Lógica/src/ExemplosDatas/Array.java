package ExemplosDatas;

import java.util.Scanner;

public class Array {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        // Exemplos de Arrays de 5 índices
        // int[] num = new int[5]
        // int[] num = {1,2,3,4,5)

        System.out.println("Digite o numero total de inteiros a serem cadastrados: ");
        int[] num = new int[sc.nextInt()];

        for(int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i+1) + "° numero: ");
            num[i] = sc.nextInt();
        }

        for(int i = 0;i < num.length; i++) {
            System.out.print(num[i] + " - ");
        }
    }

}
