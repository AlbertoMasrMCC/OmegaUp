package basico.perrito_quiere_hueso;

// https://omegaup.com/arena/problem/El-perrito-que-quiere-un-hueso/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] hueso1 = br.readLine().split(" ");
    String[] hueso2 = br.readLine().split(" ");

    int contadorHueso1 = 0;
    int contadorHueso2 = 0;

    if(Integer.parseInt(hueso1[0]) > Integer.parseInt(hueso2[0])) {
      contadorHueso1++;
    } else if(Integer.parseInt(hueso1[0]) < Integer.parseInt(hueso2[0])) {
        contadorHueso2++;
    }

    if(Integer.parseInt(hueso1[1]) > Integer.parseInt(hueso2[1])) {
        contadorHueso1++;
      } else if(Integer.parseInt(hueso1[1]) < Integer.parseInt(hueso2[1])) {
        contadorHueso2++;
    }

    if(contadorHueso1 > contadorHueso2) {
      System.out.println("Hueso 1");
    } else if(contadorHueso1 < contadorHueso2) {
      System.out.println("Hueso 2");
    } else {
      System.out.println("Perrito confundido :(");
    }
  }
}