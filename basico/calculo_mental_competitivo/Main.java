package basico.calculo_mental_competitivo;

// https://omegaup.com/arena/problem/Calculos-mentales-competitivos/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.Math;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float r = Float.parseFloat(br.readLine());

    float suma = r + 5;
    float cuadrado = (float) Math.pow(suma, 2);
    float dividir = cuadrado / (r / 3);
    float resultado = (float) Math.pow(dividir, 3);
    System.out.printf("%.6f\n", r);
    System.out.printf("%.6f\n", suma);
    System.out.printf("%.6f\n", cuadrado);
    System.out.printf("%.6f\n", dividir);
    System.out.printf("%.6f\n", resultado);
  }
}