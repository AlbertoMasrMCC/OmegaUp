package basico.multiplicacion_basica;

// https://omegaup.com/arena/problem/0-Multiplicacion-basica/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numeros = br.readLine().split(" ");
        int numero1 = Integer.parseInt(numeros[0]);
        int numero2 = Integer.parseInt(numeros[1]);
        System.out.println(numero1 * numero2);
    }
}
