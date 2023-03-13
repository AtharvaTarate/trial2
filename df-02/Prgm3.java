import java.util.*;

 class Charlie{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         char var = sc.next().charAt(0);

         if((64<var) && (var<123)){

            System.out.println("Not a special character");
         }
         else if((48<var) && (var<57)){
            System.out.println("Not a special character");
         }
         else{
            System.out.println(var+" is a special character");
         }
     }
    
}
