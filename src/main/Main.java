package main;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int number = random.nextInt(100);
        System.out.println("Number: " + number);

        System.out.println("TUTAINA TUTURUMA");

    }
}
