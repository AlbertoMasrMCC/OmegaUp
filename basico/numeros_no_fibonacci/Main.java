package basico.numeros_no_fibonacci;

// https://omegaup.com/arena/problem/nofib/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroFinal = Integer.parseInt(br.readLine());

        ArrayList<Integer> numerosFibonacci = new ArrayList<Integer>();
        for(int i = 1; i < numeroFinal; i++) {
            int fibonacci = fibonacci(i);
            if(fibonacci > numeroFinal) {
                break;
            }
            numerosFibonacci.add(fibonacci);
        }

        for(int i = 1; i < numeroFinal; i++) {
            if(!numerosFibonacci.contains(i)) {
                System.out.print(i);
                if(i < numeroFinal) {
                    System.out.print(" ");
                }
            }
        }
    }

    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}