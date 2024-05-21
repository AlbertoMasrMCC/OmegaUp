package basico.comparaciones_2;

// https://omegaup.com/arena/problem/GPC1H/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numero1 = Integer.parseInt(br.readLine());
    int numero2 = Integer.parseInt(br.readLine());

    if(numero1 > numero2) {
      System.out.println("mayor");
    } else if(numero1 < numero2) {
      System.out.println("menor");
    } else {
      System.out.println("iguales");
    }
  }
}