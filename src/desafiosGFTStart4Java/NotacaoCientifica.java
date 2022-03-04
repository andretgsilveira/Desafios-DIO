package desafiosGFTStart4Java;

import java.io.IOException;
import java.util.Scanner;

public class NotacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double X = leitor.nextDouble();
        System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
//        Double N = leitor.nextDouble();
//
//        if (N > 0)
//            System.out.printf("+%5.4E", N);
//        else
//            System.out.printf("%5.4E", N);

    }
}

