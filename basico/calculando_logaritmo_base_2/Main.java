package basico.calculando_logaritmo_base_2;

// https://omegaup.com/arena/problem/Calculando-el-logaritmo-base-2/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int base = 2;
    int vecesMultiplicadas = 1;

    while(true) {
        if (n == base) {
            break;
        }
    
        base *= 2;
        vecesMultiplicadas++;
    }

    System.out.println(vecesMultiplicadas);
  }
}