package basico.filtrando_multiplos;

// https://omegaup.com/arena/problem/Filtrando-multiplos/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] entradas = br.readLine().split(" ");
    int multiploDe = Integer.parseInt(br.readLine());

    int contador = 1;
    for (String entrada : entradas) {
        if(Integer.parseInt(entrada) % multiploDe == 0) {
            System.out.print(entrada);
        } else {
            System.out.print("X");
        }

        if(contador == n) {
            break;
        }

        System.out.print(" ");
        contador++;
    }
  }
}