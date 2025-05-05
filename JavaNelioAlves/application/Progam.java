package application;

import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para N: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o proximo valor: ");
            vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma/n;
        System.out.println("MEDIA FINAL FOI: " +media);

        sc.close();
    }
}
