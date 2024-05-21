package basico.pb_frecuencias;

// https://omegaup.com/arena/problem/pb-Frecuencias/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");
    int p = Integer.parseInt(entradas[0]);
    int n = Integer.parseInt(entradas[1]);

    int[] profesores = new int[p];
    String[] frecuencias = br.readLine().split(" ");

    for(int i = 0; i < n; i++) {
      int profesor = Integer.parseInt(frecuencias[i]);
      profesores[profesor - 1]++;
    }

    for(int i = 0; i < p; i++) {
      System.out.println((i + 1) +"-"+ profesores[i]);
    }

  }
}