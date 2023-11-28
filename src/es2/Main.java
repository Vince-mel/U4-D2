package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int num =  input.nextInt();
        input.close();
        Intero(num);

    }

    public static void Intero (int num) {
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Numero intero non compreso tra 0 e 3");
                break;
        }
    }


}
