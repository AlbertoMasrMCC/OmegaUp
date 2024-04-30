package basico.comparaciones;

// https://omegaup.com/arena/problem/CR-Comparaciones/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int primerNumero = Integer.parseInt(br.readLine());
    int segundoNumero = Integer.parseInt(br.readLine());

    if (primerNumero > segundoNumero) {
      System.out.println("mayor");
    } else if (primerNumero < segundoNumero) {
      System.out.println("menor");
    } else {
      System.out.println("iguales");
    }
  }
}