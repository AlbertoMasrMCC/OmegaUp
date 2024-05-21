package basico.E_S_terna_pitagorica;

// https://omegaup.com/arena/problem/ES-Terna-pitagorica/

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

    if ((a * a + b * b) == (c * c)) {
      System.out.println("SI");
    } else {
      System.out.println("NO");
    }
  }
}