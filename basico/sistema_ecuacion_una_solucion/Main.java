package basico.sistema_ecuacion_una_solucion;

// https://omegaup.com/arena/problem/Sistemas-de-ecuaciones-1sol/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] ecuacion1 = br.readLine().split(" ");
    String[] ecuacion2 = br.readLine().split(" ");

    double a1 = Double.parseDouble(ecuacion1[0]);
    double b1 = Double.parseDouble(ecuacion1[1]);
    double c1 = Double.parseDouble(ecuacion1[2]);
    
    double a2 = Double.parseDouble(ecuacion2[0]);
    double b2 = Double.parseDouble(ecuacion2[1]);
    double c2 = Double.parseDouble(ecuacion2[2]);

    double x = ((b2 * c1) - (b1 * c2)) / ((a1 * b2) - (a2 * b1));
    double y = ((a1 * c2) - (a2 * c1)) / ((a1 * b2) - (a2 * b1));

    System.out.printf("%.6f %.6f", x, y);
  }
}