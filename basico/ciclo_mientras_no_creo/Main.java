package basico.ciclo_mientras_no_creo;

// https://omegaup.com/arena/problem/ciclo_mientras_no_cero/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numeros = br.readLine().split(" ");
    int suma = 0;
    for (String numero : numeros) {
        int numeroEntero = Integer.parseInt(numero);
        if(numeroEntero == 0){
            break;
        }
        suma += numeroEntero;
    }
    System.out.println(suma);
  }
}
