package desafiosIntermediarios;

import java.util.*;

public class Experiencias {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int quantidade = 0;
        String tipo;
        int cobaias;
        int c = 0,s = 0,r = 0, totalCobaias = 0;
        quantidade = input.nextInt();

        for (int i = 0; i < quantidade; i++){
            cobaias = input.nextInt();
            totalCobaias += cobaias;
            tipo = input.next();
            switch (tipo.toUpperCase(Locale.ROOT)){
                case "C":
                    c += cobaias;
                    break;
                case "R":
                    r += cobaias;
                    break;
                case "S":
                    s += cobaias;
                    break;
            }
        }
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);

        double porcentagemCoelhos = (double)c / (double)totalCobaias * 100;
        double porcentagemRatos = (double)r / (double)totalCobaias * 100;
        double porcentagemSapos = (double)s / (double)totalCobaias * 100;

        System.out.println(String.format("Percentual de coelhos: %.2f %%", porcentagemCoelhos));
        System.out.println(String.format("Percentual de ratos: %.2f %%", porcentagemRatos));
        System.out.println(String.format("Percentual de sapos: %.2f %%", porcentagemSapos));
    }
}
