import java.io.*;

public class CreateFile {

    public CreateFile(){
        try{
            File salesData = new File("salesData.txt");
            if(salesData.createNewFile()){ //.createNewFile returns true if new file created
                System.out.println("File created");
            }
            else
                System.out.println("File already exists");
        }
        catch(IOException e){
            System.out.println("Error Occurred");
        }
    }
}

