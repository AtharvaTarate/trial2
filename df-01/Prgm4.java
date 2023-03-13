import java.io.*;

class Delta {
    public static void main(String[] args) throws IOException{

        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);

        System.out.println("Enter row numbers");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter column numbers");
        int col = Integer.parseInt(br.readLine());

        for(int i = 0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
