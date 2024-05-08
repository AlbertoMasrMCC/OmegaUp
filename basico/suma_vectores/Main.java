package basico.suma_vectores;

// https://omegaup.com/arena/problem/Suma-de-vectores/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int dimensionVector = Integer.parseInt(br.readLine());

    String[] entradaVector1 = br.readLine().split(" ");
    int[] vector1 = new int[dimensionVector];

    String[] entradaVector2 = br.readLine().split(" ");
    int[] vector2 = new int[dimensionVector];

    for (int i = 0; i < dimensionVector; i++) {
      vector1[i] = Integer.parseInt(entradaVector1[i]);
      vector2[i] = Integer.parseInt(entradaVector2[i]);
    }

    for(int i = 0; i < dimensionVector; i++) {
        System.out.print(vector1[i] + vector2[i]);

        if(i != dimensionVector - 1)
            System.out.print(" ");
    }

  }
}