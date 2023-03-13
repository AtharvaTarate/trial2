import java.io.*;

class Alpha {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char var =(char)br.read();

        if((63<var) && (var<91)){
            System.out.println(var+" is Alphabet");

        }
        else if((96<var) && (var<123)){
            System.out.println(var+ " is  Alphabet");

        }
        else{
            System.out.println(var+ " is not a aplhabet");

        }
    }
    
    
}
