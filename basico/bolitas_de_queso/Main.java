package basico.bolitas_de_queso;

// https://omegaup.com/arena/problem/Bolitas-de-Queso/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int bolitasFrodo = Integer.parseInt(br.readLine()) ;

   int bolitasCortazar = bolitasFrodo * 3;
   int bolitasAristoteles = bolitasCortazar + 2;

   System.out.println(bolitasAristoteles);
  }
}