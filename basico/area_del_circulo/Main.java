package basico.area_del_circulo;

// https://omegaup.com/arena/problem/Area-del-circulo/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double radio = Double.parseDouble(br.readLine());
    double area = Math.PI * Math.pow(radio, 2);
    System.out.printf("%.2f\n", area);
  }
}