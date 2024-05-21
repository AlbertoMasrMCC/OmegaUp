package basico.sumando_elementos_opuesto_arreglo;

// https://omegaup.com/arena/problem/Sumando-elementos-opuestos-de-un/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] entradas = br.readLine().split(" ");

    int[] numeros = new int[n / 2];
    int[] numerosOpuestos = new int[n / 2];

    for(int i = 0; i < n / 2; i++) {
        numeros[i] = Integer.parseInt(entradas[i]);
    }

    int contador = 0;
    for(int i = n - 1; i >= 0; i--) {

        if(i < n / 2) {
            break;
        }

        numerosOpuestos[contador] = Integer.parseInt(entradas[i]);
        contador++;
    }

    for(int i = 0; i < n / 2; i++) {
        System.out.print(numeros[i] + numerosOpuestos[i]);

        if(i < n / 2 - 1) {
            System.out.print(" ");
        }
    }
  }
}