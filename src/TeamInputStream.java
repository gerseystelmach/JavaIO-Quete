import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TeamInputStream {

    public static Object readDataPeople (String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            System.out.println(obj);
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }


    }
}


/*   try {
            BufferedReader readPeople = new BufferedReader(new FileReader(pathFile));

            String reading;
            while ((reading = readPeople.readLine()) != null){
               String readString = reading.toString();
              System.out.print(readString);
            }
            readPeople.close();

        } catch(Exception ignored){} {
        }
*/

/*ObjectInputStream readPeopleObject = new ObjectInputStream(readPeople);*/

/*   List<Person> people2 = new ArrayList<>();*/

         /*   readPeopleObject.readObject();
            readPeopleObject.close();
             /*System.out.println(people.toString());
          */