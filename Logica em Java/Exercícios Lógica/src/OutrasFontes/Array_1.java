package OutrasFontes;

import java.util.Scanner;

public class Array_1 {

    // Ler 10 nums, armazenar em um array e exibir em ordem inversa de leitura

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero: ");
            num[i] = sc.nextInt();
        }

        for(int i = 9; i >= 0; i--) {
            System.out.print(num[i] + " - ");
        }

    }

}
