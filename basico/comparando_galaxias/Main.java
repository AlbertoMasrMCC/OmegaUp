package basico.comparando_galaxias;

// https://omegaup.com/arena/problem/Comparando-numero-de-galaxias/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");

    int a = Integer.parseInt(entradas[0]);
    int b = Integer.parseInt(entradas[1]);
    int c = Integer.parseInt(entradas[2]);

    System.out.print(a < b ? "True" : "False");
    System.out.print(" ");

    System.out.print(c > a ? "True" : "False");
    System.out.print(" ");

    System.out.print(a == b ? "True" : "False");
    System.out.print(" ");

    System.out.print(a != c ? "True" : "False");
    System.out.print(" ");

    System.out.print(c <= b ? "True" : "False");
  }
}