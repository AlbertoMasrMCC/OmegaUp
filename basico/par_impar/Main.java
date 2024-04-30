package basico.par_impar;

// https://omegaup.com/arena/problem/par_o_impar/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numero = Integer.parseInt(br.readLine());
    System.out.println(numero % 2 == 0 ? "par" : "impar");
  }
}
