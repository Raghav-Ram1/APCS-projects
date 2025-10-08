import java.io.File;
import java.util.Scanner;

import java.io.IOException;

public class song {
    public void getdata(){
        Scanner in;
        try{    
            in = new Scanner(new File("songs 2025-2026.csv"));
        while(in.hasNext()){
            System.out.print(in.nextLine());
        }
        in.close();
        }
        catch(IOException e){
            System.out.println("Error reading the file");
        }
      
    }
}
