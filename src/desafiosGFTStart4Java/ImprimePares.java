package desafiosGFTStart4Java;

import java.io.IOException;

import java.util.Scanner;

public class ImprimePares {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int cont = 1;

        do {
            if ((cont % 2) == 0) {
                System.out.println(cont);
            }
            cont++;
        } while (cont <= x);
    }
}
