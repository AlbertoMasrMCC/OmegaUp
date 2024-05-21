package basico.divide_sumaras;

// https://omegaup.com/arena/problem/Divide-y-sumaras/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int sumatoria = 0;

    for(int i = 0; i < n; i++) {
        
        if(i == 0) {
            sumatoria += n / 1;
            continue;
        }

      sumatoria += n / Math.pow(2, i);
    }

    System.out.println(sumatoria);
  }
}