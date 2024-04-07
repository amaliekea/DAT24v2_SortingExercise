import java.util.Arrays;
import java.util.Comparator;

public class SortPeople  {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90),
                new Person("Sixten", "Jensen", 99, 1.70),
                new Person ("amalie", "Filipson", 88, 176),
        };

        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        // skriv kode herunder
        Arrays.sort(people); // sorterer people efter compareto metode i Person klasse
        System.out.println("Sorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }
    }


}
