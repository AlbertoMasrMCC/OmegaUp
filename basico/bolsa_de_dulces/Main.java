package basico.bolsa_de_dulces;

// https://omegaup.com/arena/problem/Bolsas-de-dulces/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int suma = 0;
    for (int i = 0; i < n; i++) {
        String[] entradaNueva = br.readLine().split(" ");
        int cantidad = Integer.parseInt(entradaNueva[0]);
        int precio = Integer.parseInt(entradaNueva[1]);

        suma += cantidad * precio;
    }
    System.out.println(suma);
  }
}
