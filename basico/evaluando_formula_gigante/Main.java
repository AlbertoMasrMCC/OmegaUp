package basico.evaluando_formula_gigante;

// https://omegaup.com/arena/problem/Evaluando-una-formula-gigante/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entrada = br.readLine().split(" ");
    float x = Float.parseFloat(entrada[0]);
    float y = Float.parseFloat(entrada[1]);
    float z = Float.parseFloat(entrada[2]);

    float primeraParte = ((2 * x + y) / z) * (y * y * y - z);
    float segundaParte = ((x + 2 * y + 3 * z) / (z - 2 * y - 3 * x)) + (x * x) + (z * z);

    float resultado = primeraParte / segundaParte;

    System.out.printf("%.6f", resultado);
  }
}