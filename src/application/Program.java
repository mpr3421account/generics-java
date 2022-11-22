package application;

import services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.println("How many values?");
        int n = sc.nextInt();

        for(int i = 0; i< n; i++){
            int value = sc.nextInt();
                    ps.addValue(value);
        }
        ps.print();
        System.out.println("First: "+ ps.first());




        sc.close();
    }
}