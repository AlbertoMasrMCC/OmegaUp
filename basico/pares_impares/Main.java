package basico.pares_impares;

// https://omegaup.com/arena/problem/Pares-e-impares/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] numeros = br.readLine().split(" ");

    int pares = 0;
    int impares = 0;

    for(int i = 0; i < n; i++) {
      int numero = Integer.parseInt(numeros[i]);
      if(numero % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }

    System.out.print(pares + " " + impares);
  }
}