import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Zurabi", 29));
        people.add(new Person("Raphael", 35));
        people.add(new Person ("Thuy", 32));
        people.add(new Person ("Gersey", 29));
        
        // Writing and reading instances of a list of Persons
       TeamOutputStream.writeData(people, "people.txt");
       TeamInputStream.readDataPeople("people.txt");

        // Writing instances of a single object
        
        Person gersey = new Person("Gersey", 29);

        PersonOutputStream.WriteObjectToFile(gersey.getName() + ".txt", gersey);
        PersonInputStream.ReadObjectFromFile(gersey.getName() + ".txt");

        
    }
}
