package desafiosBasicos;

import java.util.Scanner;

public class VisitaNaFeira {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int resultado = soma(a, b);

        System.out.println("X = " + resultado);

    }

    public static int soma(int x, int y){
        return x + y;
    }
}

