package basico.selectiva_aprobado_reprobado;

// https://omegaup.com/arena/problem/Selectivas-Aprobado-o-Reprobado/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int calificacion = Integer.parseInt(br.readLine());

    if(calificacion >= 6) {
      System.out.println("APROBATORIA");
    } else {
      System.out.println("REPROBATORIA ");
    }
  }
}