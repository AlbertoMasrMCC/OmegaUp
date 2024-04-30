package basico.a_mas_b;

// https://omegaup.com/arena/problem/GPCAB/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numeros = br.readLine().split(" ");
    int a = Integer.parseInt(numeros[0]);
    int b = Integer.parseInt(numeros[1]);
    int suma = a + b;

    System.out.print(suma);
  }
}