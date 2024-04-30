package basico.area_de_un_rectangulo;

// https://omegaup.com/arena/problem/area_de_un_rectangulo/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] lados = br.readLine().split(" ");
    int base = Integer.parseInt(lados[0]);
    int altura = Integer.parseInt(lados[1]);
    System.out.println(base * altura);
  }
}
