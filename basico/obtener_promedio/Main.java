package basico.obtener_promedio;

// https://omegaup.com/arena/problem/1-Obtener-promedio/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int alumnos = Integer.parseInt(br.readLine());
    String[] calificaciones = br.readLine().split(" ");

    int suma = 0;
    for (String calificacion : calificaciones) {
      suma += Integer.parseInt(calificacion);
    }

    float promedio = (float) suma / (float) alumnos;

    System.out.printf("%.2f", promedio);
  }
}