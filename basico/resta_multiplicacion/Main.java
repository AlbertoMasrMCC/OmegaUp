package basico.resta_multiplicacion;

// https://omegaup.com/arena/problem/resta_y_multiplicacion/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int a = Integer.parseInt(line[0]);
    int b = Integer.parseInt(line[1]);
    int c = Integer.parseInt(line[2]);
    int d = Integer.parseInt(line[3]);

    int resta = (a - b) * (c - d);

    System.out.println(resta);
  }
}