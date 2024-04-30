package basico.lecuta_escritura;

// https://omegaup.com/arena/problem/CR-Lectura-y-escritura/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int minutos = Integer.parseInt(br.readLine());
    int segundos = minutos * 60;
    System.out.println(segundos);
  }
}
