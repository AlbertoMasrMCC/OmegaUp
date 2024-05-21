package basico.producto_dos_vectores;

// https://omegaup.com/arena/problem/Producto-punto-de-dos-vectores/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] vector1 = br.readLine().split(" ");
    String[] vector2 = br.readLine().split(" ");

    int sumatoria = 0;

    for(int i = 0; i < n; i++) {
      sumatoria += Integer.parseInt(vector1[i]) * Integer.parseInt(vector2[i]);
    }

    System.out.println(sumatoria);
  }
}