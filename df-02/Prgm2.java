import java.io.*;

class Bravo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char var = (char)br.read();

        if((var==65) || (var==69) || (var==73) || (var==79) || (var==85)){
            System.out.println(var+ " is a vowel");
        }
        else{
            System.out.println(var+ " is a consonant");
        }

    }
    
}
