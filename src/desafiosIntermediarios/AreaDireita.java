package desafiosIntermediarios;

import java.util.Scanner;

public class AreaDireita {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (i < j && i >= M.length-j) soma += M[i][j];
            }
        }
        if (O == 'M') {
            soma /= 30;
        }

        System.out.println(String.format("%.1f", soma));
    }
}

