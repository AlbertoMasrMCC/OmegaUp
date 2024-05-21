package basico.practica_ciclos_ASINUS;

// https://omegaup.com/arena/problem/Practica-Ciclos-ASINUS/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] numeros = new int[n];

    for(int i = 0; i < n; i++) {
        numeros[i] = Integer.parseInt(br.readLine());
    }

    int suma = 0;

    for (int numero : numeros) {
        suma += numero;
    }

    System.out.println(suma);
  }
}