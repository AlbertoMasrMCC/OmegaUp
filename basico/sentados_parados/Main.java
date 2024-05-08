package basico.sentados_parados;

// https://omegaup.com/arena/problem/COMI-Sentados-o-parados/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");
    int boletosVendidos = Integer.parseInt(br.readLine());

    int asientosTotales = Integer.parseInt(entradas[0]) * Integer.parseInt(entradas[1]);
    int personasSentadas = 0;
    int personasSinAsiento = 0;

    if(boletosVendidos > asientosTotales) {
        personasSentadas = asientosTotales;
        personasSinAsiento = boletosVendidos - asientosTotales;
    } else {
        personasSentadas = boletosVendidos;
    }

    System.out.printf("%d %d\n", personasSentadas, personasSinAsiento);
  }
}