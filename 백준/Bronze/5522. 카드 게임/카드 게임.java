import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        
        for (int i = 1; i <= 5; i++) {
            total += Integer.parseInt(br.readLine()); 
        }
        System.out.print(total);
    }
}