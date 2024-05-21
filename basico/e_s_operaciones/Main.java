package basico.e_s_operaciones;

// https://omegaup.com/arena/problem/ES-Operaciones/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numeros = br.readLine().split(" ");
    int primerNumero = Integer.parseInt(numeros[0]);
    int segundoNumero = Integer.parseInt(numeros[1]);

    System.out.print(primerNumero + segundoNumero);
    System.out.print(" ");
    System.out.print(primerNumero - segundoNumero);
    System.out.print(" ");
    System.out.print(primerNumero / segundoNumero);
    System.out.print(" ");
    System.out.print(primerNumero * segundoNumero);
    System.out.print(" ");
    System.out.print(primerNumero % segundoNumero);
  }
}