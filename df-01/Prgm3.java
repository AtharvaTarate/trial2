
import java.io.*;

 class Charlie {
     public static void main(String[] args) throws IOException{
         InputStreamReader io = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(io);

         int num = Integer.parseInt(br.readLine());

         if(num%2==0){
             System.out.println(num+ " is even");
         }
         else if(num%2==1){
             System.out.println(num+ " is odd");
         }
         else if (num==0){
             System.out.println(num+ " is equal to zero");
         }

     }
    
}
