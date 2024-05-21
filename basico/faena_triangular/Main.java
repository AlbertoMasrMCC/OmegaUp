package basico.faena_triangular;

// https://omegaup.com/arena/problem/Faena-Triangular/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entrada = br.readLine().split(" ");

    int a = Integer.parseInt(entrada[0]);
    int b = Integer.parseInt(entrada[1]);

    int c = (a * a) + (b * b);

    System.out.println(c);
  }
}