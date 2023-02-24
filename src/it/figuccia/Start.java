package it.figuccia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Inserire numero positivo"));
        int n = scanner.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        for(int i = 2; i<n;i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        System.out.println("i numeri primi compresi tra 0 e " + n + " sono "+ primeNumbers.size()+": "+primeNumbers);
    }
}