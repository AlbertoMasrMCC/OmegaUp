package basico.calcular_descuento;

// https://omegaup.com/arena/problem/Calcular-el-descuento/

// TODO: Hay un error

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cantidad = Integer.parseInt(br.readLine());

    if(cantidad > 1000) {
        int descuento = (int) (cantidad * 0.15);
        cantidad -= descuento;
    }

    System.out.println(cantidad);
  }
}