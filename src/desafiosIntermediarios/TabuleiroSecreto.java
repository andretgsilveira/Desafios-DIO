package desafiosIntermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException{

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = buffer.readLine().split(" ");

        int tabuleiro = Integer.parseInt(nq[0]);
        int jogadas = Integer.parseInt(nq[1]);

        int m[][] = new int[tabuleiro][tabuleiro];
        int auxArray[] = new int[tabuleiro];

        for (int x = 0; x < m.length; x++) {
            for (int y = 0; y < m[x].length; y++) {
                m[x][y] = 0;
            }
        }

        int x = 0, r = 0, j = 0, cont = 0;


        for (int i = 0; i < jogadas; i++) {
            String[] entrada = buffer.readLine().split(" ");
            switch (Integer.parseInt(entrada[0])) {
                case 1:
                    x = Integer.parseInt(entrada[1]);
                    r = Integer.parseInt(entrada[2]);
                    for (j = 0; j < m.length; j++) {
                        m[x - 1][j] = r;
                    }
                    break;
                case 2:
                    x = Integer.parseInt(entrada[1]);
                    r = Integer.parseInt(entrada[2]);
                    for (j = 0; j < m.length; j++) {
                        m[j][x - 1] = r;
                    }
                    break;
                case 3:
                    x = Integer.parseInt(entrada[1]);
                    for (j = 0; j < m.length; j++) {
                        auxArray[j] = m[x-1][j];
                    }
                    System.out.println(duplicado(auxArray));
                    break;
                case 4:
                    x = Integer.parseInt(entrada[1]);
                    for (j = 0; j < m.length; j++) {
                        auxArray[j] = m[j][x-1];
                    }
                    System.out.println(duplicado(auxArray));
                    break;
            }


        }

    }

    public static int duplicado(int arr[]) {
        int numero = 0;
        int numeroAux = 0;
        int cont = 0;
        int contAux = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    numeroAux = arr[i];
                    cont++;
                }
            }
            if (cont > contAux) {
                contAux = cont;
                numero = numeroAux;
            } else if (cont == contAux && numeroAux > numero) {
                contAux = cont;
                numero = numeroAux;
            }
            cont = 0;
        }
        return numero;
    }
}

