package basico.calculo_condicionales;

// https://omegaup.com/arena/problem/Calculos-condicionales/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int resultado = Integer.parseInt(br.readLine());

    int vecesModificado = 0;

    if (resultado % 2 == 0) {
        resultado = resultado / 2;
    } else {
        resultado = resultado  + 1;
    }

    vecesModificado++;

    if(String.valueOf(resultado).length() >= 3) {
        vecesModificado++;
        resultado = resultado / 100;
    } else if(String.valueOf(resultado).length() == 2) {
        vecesModificado++;
        resultado = resultado / 10;
    }

    if(resultado % 3 == 0) {
        vecesModificado++;
        resultado = resultado - 1;
    }

    System.out.println(resultado + " " + vecesModificado);

  }
}