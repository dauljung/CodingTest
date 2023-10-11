import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = Integer.parseInt(input);

        for (int i=1;i<=count;i++){
            System.out.println("Test Case #"+i);
            if(Integer.parseInt(br.readLine()) > count){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}