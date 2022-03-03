package desafiosIniciais;

import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = scan.nextInt();
        int cont = 1;
        do {
            if ((cont % 2) == 0){
                System.out.println(cont);
            }
            cont++;
        }while (cont <= x);
    }

}

