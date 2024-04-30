package basico.repartiendo_cachorros;

// https://omegaup.com/arena/problem/Repartiendo-cachorros/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entrada = br.readLine().split(" ");
    int cachorros = Integer.parseInt(entrada[0]);
    int perritosQueSeQueda = Integer.parseInt(entrada[1]);
    int hijos = Integer.parseInt(entrada[2]);

    int perritosQueSeVa = cachorros - perritosQueSeQueda;
    int perritosRestantes = perritosQueSeVa % (hijos + 1); // Se suma 1 por la esposa

    int perritosQueSeQuedanConDonPancho = perritosQueSeQueda + perritosRestantes;

    System.out.println(perritosQueSeQuedanConDonPancho);
  }
}
