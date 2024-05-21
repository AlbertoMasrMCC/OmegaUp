package basico.area_triangulo;

// https://omegaup.com/arena/problem/area_de_un_triangulo/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entrada = br.readLine().split(" ");

    double b = Double.parseDouble(entrada[0]);
    double h = Double.parseDouble(entrada[1]);

    double a = (b * h) / 2;

    System.out.printf("%.2f", a);
  }
}