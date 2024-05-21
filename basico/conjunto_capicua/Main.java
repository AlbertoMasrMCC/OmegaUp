package basico.conjunto_capicua;

// https://omegaup.com/arena/problem/Conjunto-Capicua/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] entradas = br.readLine().split(" ");

    int[] numeros = new int[n];
    int[] numerosReves = new int[n];

    for(int i = 0; i < n; i++) {
        numeros[i] = Integer.parseInt(entradas[i]);
    }

    int contador = 0;
    for(int i = n - 1; i >= 0; i--) {
        numerosReves[contador] = Integer.parseInt(entradas[i]);
        contador++;
    }

    boolean capicua = true;
    for(int i = 0; i < n; i++) {
        if(numeros[i] != numerosReves[i]) {
            capicua = false;
            break;
        }
    }

    System.out.println(capicua ? "SI" : "NO");
  }
}