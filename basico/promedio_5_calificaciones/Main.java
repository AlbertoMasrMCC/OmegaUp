package basico.promedio_5_calificaciones;

// https://omegaup.com/arena/problem/promedio_5_calificaciones/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] calificaciones = br.readLine().split(" ");

    double promedio = 0;

    for (String calificacion : calificaciones) {
      promedio += Double.parseDouble(calificacion);
    }

    System.out.println(promedio / calificaciones.length);
  }
}