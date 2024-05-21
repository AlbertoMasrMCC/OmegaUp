package basico.porque_podemos_programar;

// https://omegaup.com/arena/problem/Porque-podemos-programar/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double x = Double.parseDouble(br.readLine());

    double primeraParte = (((x + x * x) / (5 * x + 3)) + x);
    double segundaParte = (((x + x * x) / (5 * x + 3)) / (((x + x * x) / (5 * x + 3)) + (2 * x)));

    double y = primeraParte * segundaParte;

    System.out.printf("%.6f", y);
  }
}