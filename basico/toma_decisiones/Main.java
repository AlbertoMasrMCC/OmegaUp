package basico.toma_decisiones;

// https://omegaup.com/arena/problem/Toma-de-decisiones/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entrada = br.readLine().split(" ");
    int a = Integer.parseInt(entrada[0]);
    int b = Integer.parseInt(entrada[1]);

    int resultado = a + b;
    if(resultado == 5) {
        int resultado2 = b + 3;
        int resultado3 = 2 * a + resultado2;
        System.out.println(resultado3);
    } else {
        int resultado4 = a - 1;
        int resultado5 = 7 * resultado4 + b;

        if(resultado5 % 2 == 0) {
            System.out.println(resultado4 - b);
        } else {
            System.out.println(resultado4 * b);
        }
    }
  }
}