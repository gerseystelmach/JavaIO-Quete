import java.io.Serializable;

public class Person implements Serializable {

   private String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString method to print the detail of an object
/*    @Override
    public String toString() {
        return "People { \n" +
                "name='" + name + '\'' +
                "age='" + age + '\'' + "}\n";
    }*/

    @Override
    public String toString() {
        return new StringBuffer(" Name : ").append(this.name).append(", Age : ").append(this.age).toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
