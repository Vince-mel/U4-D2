package es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Inserisci un numero per avviare il conto alla rovescia: ");
        int num2 = Input.nextInt();
        Input.close();
        ContoRovescia(num2);
    }
    public static void ContoRovescia (int num2) {
        for (int i=num2; i>=0; i--) {
            System.out.println(i);
        }
    }
}
