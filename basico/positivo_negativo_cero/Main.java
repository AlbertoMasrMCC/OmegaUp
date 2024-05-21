package basico.positivo_negativo_cero;

// https://omegaup.com/arena/problem/Positivo-Negativo-o-Cero/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numero = Integer.parseInt(br.readLine());

    if(numero > 0) {
      System.out.println("POSITIVO");
    } else if(numero < 0) {
      System.out.println("NEGATIVO");
    } else {
      System.out.println("CERO");
    }
  }
}