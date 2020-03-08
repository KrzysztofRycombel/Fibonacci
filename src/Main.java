/*
Program znajduje n-ty wyraz ciągu Fibonacciego.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj n-ty wyraz ciagu Fibonacciego: ");

        try {
            int nElementOfSequence = input.nextInt();
            System.out.println("Wynik: "+fibonacci(nElementOfSequence));

        } catch (InputMismatchException e){
            System.out.println("Podaj liczbę w prawidłowym formacie");
        }


    }
}