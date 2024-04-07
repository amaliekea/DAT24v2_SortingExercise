import java.util.Comparator;

public class Person implements Comparable <Person> {

    public static Comparator<Person> COMPARATOR = Comparator.comparing(Person::getLastName)
            .thenComparing(Person::getAge);

    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Fornavn: " + getFirstName() + ", Efternavn: " + getLastName() + ", Alder: " + getAge() + ", Højde: " + getHeight();
    }

    @Override
    public int compareTo(Person o) {
        if (getAge() == o.getAge()) {
            return 0;
        } else if (getAge() > o.getAge()) {
            return 1;
        } else return -1;

    }
}

