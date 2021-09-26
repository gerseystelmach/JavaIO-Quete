import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonOutputStream {

    public static void WriteObjectToFile(String filepath,Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object was successfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
