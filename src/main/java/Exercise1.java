import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> names = asList("Jenny", "Olof", "John", "Starlord", "Jack", "Bronzebeard", "Justin", "Piper");
        String sorted = names.stream()
                .filter(name -> (names.indexOf(name) % 2) != 0)
                .map(name -> name = names.indexOf(name) + "." + name)
                .collect(Collectors.joining(", ", "", "."));

        System.out.println(sorted);
    }
}
