package basico.etapas_de_la_vida;

// https://omegaup.com/arena/problem/Etapas-de-la-vida/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int edad = Integer.parseInt(br.readLine());

    if (edad <= 3) {
        System.out.println("BEBE");
    } else if(edad >= 4 && edad <= 14) {
        System.out.println("NINO");
    } else if(edad >= 15 && edad <= 18) {
        System.out.println("JOVEN");
    } else if(edad >= 19 && edad <= 65) {
        System.out.println("ADULTO");
    } else {
        System.out.println("ADULTO 3RA");
    }
  }
}