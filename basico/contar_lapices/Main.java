package basico.contar_lapices;

// https://omegaup.com/arena/problem/A-contar-lapices/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");
    int cantidadLapices = Integer.parseInt(entradas[0]);
    int numeroLapiz = Integer.parseInt(entradas[1]);

    int[] lapices = new int[cantidadLapices];
    for(int i = 0; i < cantidadLapices; i++) {
      lapices[i] = Integer.parseInt(br.readLine());
    }

    int numeroLapicesEncontrados = 0;
    for (int lapiz : lapices) {
        if(lapiz == numeroLapiz) {
            numeroLapicesEncontrados++;
        }
    }

    System.out.println(numeroLapicesEncontrados);

  }
}