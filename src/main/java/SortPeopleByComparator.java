import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortPeopleByComparator {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
        people.add(new Person("Hans", "Filipson", 30, 1.70));
        people.add(new Person("Merete", "Poulsen", 12, 1.22));
        people.add(new Person("Ibsen", "Poulsen", 55, 1.20));
        people.add(new Person("Sixten", "Ottesen", 15, 1.90));
        people.add(new Person("Sixten", "Jensen", 99, 1.70));
        people.add(new Person("amalie", "Filipson", 88, 176));

        System.out.println("Usorteret liste af personer:");
        for (
                Person person : people) {
            System.out.println(person);
        }
        Collections.sort(people, new LastNameComparator());
        System.out.println("Sorteret liste af personer på baggrund af efternavn:");
        for (
                Person person : people) {
            System.out.println(person);
        }
    }
}

