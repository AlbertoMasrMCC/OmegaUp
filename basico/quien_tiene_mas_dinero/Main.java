package basico.quien_tiene_mas_dinero;

// https://omegaup.com/arena/problem/Quien-tiene-mas-dinero/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int dineroJuan = 0;
    int dineroPedro = 0;

    for (int i = 1; i <= 3; i++) {
        dineroJuan += Integer.parseInt(br.readLine());
    }

    for (int i = 1; i <= 2; i++) {
        dineroPedro += Integer.parseInt(br.readLine());
    }

    System.out.println(dineroJuan > dineroPedro ? "Juan" : "Pedro");
  }
}