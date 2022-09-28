import java.util.ArrayList;
import java.io.*;

public class WriteToClass {

    public WriteToClass(ArrayList<Object> obj){
        try{
            FileWriter fw = new FileWriter("salesData.txt", true); //Boolean allows appending to file
            PrintWriter salesWriter = new PrintWriter(fw);

            for (int i = 0; i < obj.size(); i++){
                salesWriter.println(obj.get(i));
            }

            salesWriter.close();
        }
        catch(IOException e){

        }
    }
}
