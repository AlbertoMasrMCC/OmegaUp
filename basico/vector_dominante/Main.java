package basico.vector_dominante;

// https://omegaup.com/arena/problem/Vector-dominante/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tamanoSecuencia = Integer.parseInt(br.readLine());
    String[]  primeraSecuencia = br.readLine().split(" ");
    String[]  segundaSecuencia = br.readLine().split(" ");

    for (int i = 0; i < tamanoSecuencia; i++) {
        if(Integer.parseInt(primeraSecuencia[i]) <= Integer.parseInt(segundaSecuencia[i])) {
          System.out.print("0");
          return;
        }
    }

    System.out.println("1");
  }
}