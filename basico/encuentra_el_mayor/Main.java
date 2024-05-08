package basico.encuentra_el_mayor;

// https://omegaup.com/arena/problem/Encuentra-el-mayor/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] numeros = br.readLine().split(" ");

    int mayor = Integer.parseInt(numeros[0]);

    for (String numero : numeros) {
        if(Integer.parseInt(numero) > mayor) {
            mayor = Integer.parseInt(numero);
        }
    }

    System.out.println(mayor);
  }
}