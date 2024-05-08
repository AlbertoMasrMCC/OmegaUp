package basico.rango;

// https://omegaup.com/arena/problem/m3/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");
    int rangoInferior = Integer.parseInt(entradas[0]);
    int rangoSuperior = Integer.parseInt(entradas[1]);

    for(int i = rangoInferior; i <= rangoSuperior; i++) {
      System.out.print(i);

        if(i < rangoSuperior)
            System.out.print(" ");
    }
  }
}