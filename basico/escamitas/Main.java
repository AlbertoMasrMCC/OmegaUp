package basico.escamitas;

// https://omegaup.com/arena/problem/Escamitas/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int temperatura = Integer.parseInt(br.readLine());

    if(temperatura >= 21 && temperatura <= 29) {
        System.out.println("tibia");
    } else if(temperatura >= 15 && temperatura < 21) {
        System.out.println("fria!");
    } else if(temperatura > 29 && temperatura <= 34) {
        System.out.println("caliente!");
    }

    if(temperatura < 15 || temperatura > 34) {
        System.out.println("RIP escamitas :(");
    }
  }
}
