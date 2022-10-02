package OutrasFontes;

import java.util.Scanner;

public class Array_2 {

    // Ler 10 nums, armazenar em um array e exibir em outro vetor que multiplica por 3

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] mult = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero: ");
            num[i] = sc.nextInt();
            mult[i] = num[i] * 3;
        }

        for(int i =0; i < 10; i++) {
            System.out.print(mult[i] + " - ");
        }

    }

}
