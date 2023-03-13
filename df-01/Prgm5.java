import java.io.*;

class Echo  {
    public static void main(String[] args) throws IOException{
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);

        int num = Integer.parseInt(br.readLine());

        if((num%5==0) && (num%11==0)){
            System.out.println(num+" is divisible by 5&11");
        }
        else{
            System.out.println(num+" is not divisible by 5 & 11");
        }

    }
    
}
