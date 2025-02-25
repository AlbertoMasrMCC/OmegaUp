package basico.reverso;

// https://omegaup.com/arena/problem/Reverso/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] entradas = br.readLine().split(" ");

    for (int i = n - 1; i >= 0; i--) {
        System.out.print(entradas[i]);

        if(i != 0)
            System.out.print(" ");
    }
  }
}