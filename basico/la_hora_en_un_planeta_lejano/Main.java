package basico.la_hora_en_un_planeta_lejano;

// https://omegaup.com/arena/problem/La-hora-en-un-planeta-lejado/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int segundos = Integer.parseInt(br.readLine());

    int dias = segundos / 42000;
    int horas = (segundos - dias * 42000) / 3500;
    int minutos = (segundos - dias * 42000 - horas * 3500) / 50;
    int segundosRestantes = segundos - dias * 42000 - horas * 3500 - minutos * 50;

    System.out.printf("%d %d %d %d\n", dias, horas, minutos, segundosRestantes);

  }
}