package basico.imprimiendo_enteros_paridad;

// https://omegaup.com/arena/problem/Imprimiendo-enteros-por-paridad/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] numeros = br.readLine().split(" ");
    int p = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(numeros[i]);
      
      if(p == 0) {
        if(num % 2 == 0) {
            System.out.print(num);

            if(i < n - 1) {
                System.out.print(" ");
            }
        }
      } else if(p == 1) {
        if(num % 2 != 0) {
            System.out.print(num);

            if(i < n - 1) {
                System.out.print(" ");
            }
        }
      }
    }
  }
}