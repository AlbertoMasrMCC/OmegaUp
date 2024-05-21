package basico.dectectando_orden;

// https://omegaup.com/arena/problem/Detectando-el-orden/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] entradas = br.readLine().split(" ");

    int a = Integer.parseInt(entradas[0]);
    int b = Integer.parseInt(entradas[1]);
    int c = Integer.parseInt(entradas[2]);

    if((a == b) && (b == c)) {
        System.out.println("I");
    } else if((a <= b) && (b <= c)) {
        System.out.println("C");
    } else if((a >= b) && (b >= c)) {
        System.out.println("D");
    } else {
        System.out.println("X");
    }
  }
}