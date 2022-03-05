package desafiosIntermediarios;

import java.util.*;

public class TabuleiroSecreto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuleiro = scan.nextInt();

        int m[][] = new int[tabuleiro][tabuleiro];
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                m[x][y] = 0;
            }
        }

        int jogadas = scan.nextInt();
        int x = 0, r = 0, j = 0, cont = 0;


        for (int i = 0; i < jogadas; i++){
            int operacao = scan.nextInt();
            switch (operacao){
                case 1:
                    x = scan.nextInt();
                    r = scan.nextInt();
                    for (j = 0; j < m.length; j++){
                        m[x-1][j] = r;
                    }
                    break;
                case 2:
                    x = scan.nextInt();
                    r = scan.nextInt();
                    for (j = 0; j < m.length; j++){
                        m[j][x-1] = r;
                    }
                    break;
                case 3:
                    x = scan.nextInt();

                    for(i = 0; i < m.length; i++){
                        for(j = 0; j < m.length; j++){
                            if(m[i][x-1] == m[j][x-1]){
                                cont++;
                            }
                        }

                    }




                    break;
                case 4:
                    x = scan.nextInt();

                    break;
            }

        }

//        for (x = 0; x < m.length; x++){
//            for (int y = 0; y < m[x].length; y++){
//                System.out.print(m[x][y]);
//            }
//            System.out.println();
//        }
    }
}
