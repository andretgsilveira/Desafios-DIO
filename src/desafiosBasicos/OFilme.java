package desafiosBasicos;

import java.util.Scanner;

public class OFilme {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();

        double porcentagem = ((B / A) - 1) * 100;

        System.out.printf("%.2f", porcentagem);
        System.out.println("%");
    }
}
