package basico.bajando_caracteres;

// https://omegaup.com/arena/problem/Bajando-los-caracteres/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String cadena = br.readLine();

    for(int i = 0; i < cadena.length(); i++) {
        System.out.println(cadena.charAt(i));
    }
  }
}