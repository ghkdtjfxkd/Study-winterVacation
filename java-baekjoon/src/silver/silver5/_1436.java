package silver.silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int number = 666;
        int movie = 1;
        while(movie<input){
            number++;
            if(String.valueOf(number).contains("666")){
                movie++;
            }
        }
        bw.write(String.valueOf(number));
        bw.flush();
    }
}
