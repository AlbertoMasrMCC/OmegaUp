package basico.conversion_temperatura;

// https://omegaup.com/arena/problem/Conversion-temperaturas/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int c = Integer.parseInt(br.readLine());

    int k = c + 273;
    int f = (c * 9 / 5) + 32;
    int r = (c * 4 / 5);

    System.out.print(k + " " + f + " " + r);
  }
}