package basico.imprime_pares_rango;

// https://omegaup.com/arena/problem/Imprime-pares-en-rango/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");
    int n = Integer.parseInt(entradas[0]);
    int m = Integer.parseInt(entradas[1]);

    for(int i = n; i <= m; i++) {
        if(i % 2 == 0) {
            System.out.println(i);
        }
    }
  }
}