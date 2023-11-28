package es3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una stringa fino ad inserire :q");
        String str2 = input.nextLine();
        input.close();
        Test(str2);

    }

    public static void Test (String str2) {
        String[] str3 = str2.split(",\\s*");
        System.out.println(Arrays.toString(str3));
    }
}
