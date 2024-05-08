package basico.valor_absoluto;

// https://omegaup.com/arena/problem/Valor-Absoluto/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entrada = br.readLine().split(" ");
    int numero1 = Integer.parseInt(entrada[0]);
    int numero2 = Integer.parseInt(entrada[1]);

    int suma = numero1 + numero2;

    System.out.println(Math.abs(suma));
  }
}