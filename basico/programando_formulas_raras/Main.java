package basico.programando_formulas_raras;

// https://omegaup.com/arena/problem/Programando-formulas/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.Math;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numerosReales = br.readLine().split(" ");
    float x = Float.parseFloat(numerosReales[0]);
    float y = Float.parseFloat(numerosReales[1]);
    float z = Float.parseFloat(numerosReales[2]);

    float dividendo = (float) (x + x * (y + Math.pow(z, 2)));
    float divisor = (float) ((x + Math.PI) * (y + Math.PI));

    float resultado = dividendo / divisor;

    System.out.printf("%.6f", resultado);
  }
}
