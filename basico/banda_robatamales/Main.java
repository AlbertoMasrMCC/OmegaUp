package basico.banda_robatamales;

// https://omegaup.com/arena/problem/La-banda-robatamales/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");
    int tamalesRobados = Integer.parseInt(entradas[0]);
    int miembros = Integer.parseInt(entradas[1]);

    int tamalesLider = (int) Math.ceil(((double) tamalesRobados / 2));
    int tamalesParaMiembros = tamalesRobados - tamalesLider;

    int tamalesRestantes = tamalesParaMiembros % (miembros - 1); // Se le quita al lider

    tamalesLider = tamalesLider + tamalesRestantes;

    System.out.print(tamalesLider);

  }
}