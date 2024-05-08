package basico.tipos_de_triangulos;

// https://omegaup.com/arena/problem/Tipos-de-Triangulos/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int lado1 = Integer.parseInt(input[0]);
    int lado2 = Integer.parseInt(input[1]);
    int lado3 = Integer.parseInt(input[2]);

    if(lado1 == lado2 && lado2 == lado3) {
      System.out.println("equilatero");
    } else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
      System.out.println("isosceles");
    } else {
      System.out.println("escaleno");
    }
  }
}