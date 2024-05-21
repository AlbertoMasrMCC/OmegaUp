package basico.suma_digitos;

// https://omegaup.com/arena/problem/Suma-de-los-digitos/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();

        int suma = 0;

        for(int i = 0; i < entrada.length(); i++) {
            suma += Integer.parseInt(String.valueOf(entrada.charAt(i)));
        }

        System.out.println(suma);
    }
}