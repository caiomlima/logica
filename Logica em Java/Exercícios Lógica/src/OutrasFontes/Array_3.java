package OutrasFontes;

import java.util.Scanner;

public class Array_3 {

    // Ler 10 nums, armazenar em um array e exibir em ordem crescente

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int trc = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero: ");
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            for(int j = i+1; j < 10; j++) {
                if(num[i] > num[j]) {
                    trc = num[i];
                    num[i] = num[j];
                    num[j] = trc;
                }
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(num[i] + " - ");
        }

    }

}
