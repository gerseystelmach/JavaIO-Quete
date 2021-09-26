import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class TeamOutputStream {

    public static void writeData (List<Person> people, String filepath) {

        try  {
            // Creates a file output stream to write to the file that we provide inside the parentheses.
            FileOutputStream writePerson = new FileOutputStream(filepath);
            // This will handle the object to be written into the file that FileOutputStream created.
            // FileOutputStream and ObjectOutputStream should always come together in order to write an object to a file.
            ObjectOutputStream writeObjectPerson = new ObjectOutputStream(writePerson);

            // tell the program to write this object ArrayList into the file people.txt
            // writeObjectPerson.writeObject(people.toString());
            writeObjectPerson.writeObject(people);

            // not needed but it is a good practice
            writeObjectPerson.flush();
            writeObjectPerson.close();
            System.out.println("Data successfully written in the file.");


        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
