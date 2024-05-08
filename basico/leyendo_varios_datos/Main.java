package basico.leyendo_varios_datos;

// https://omegaup.com/arena/problem/CR-Leyendo-Varios-datos/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] sumas = new int[n];

    for(int i = 0; i < n; i++) {
      String[] line = br.readLine().split(" ");
      int numero1 = Integer.parseInt(line[0]);
      int numero2 = Integer.parseInt(line[1]);

      int suma = numero1 + numero2;
      
      sumas[i] = suma;
    }

    for (int suma : sumas) {
        System.out.println(suma);
    }

  }
}