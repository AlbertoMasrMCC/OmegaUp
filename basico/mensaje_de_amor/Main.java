package basico.mensaje_de_amor;

// https://omegaup.com/arena/problem/Mensaje-de-Amor/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());
    int[] corazones = new int[m];

    for (int i = 0; i < m; i++) {
      corazones[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < corazones[i]; j++) {
        System.out.print("<3");
      }
      System.out.println();
    }
  }
}