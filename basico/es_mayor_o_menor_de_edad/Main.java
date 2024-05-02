package basico.es_mayor_o_menor_de_edad;

// https://omegaup.com/arena/problem/Es-Mayor-o-Menor-de-Edad/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int edad = Integer.parseInt(br.readLine());

    if(edad >= 18) {
      System.out.print("Es Mayor");
    } else {
      System.out.print("Es Menor");
    }
  }
}