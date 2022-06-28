import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> names = asList("Jenny", "Olof", "John", "Starlord", "Jack", "Bronzebeard", "Justin", "Piper");

        String result = names.stream()
                .map(String::toUpperCase)
                .sorted((name1, name2) -> - name1.compareTo(name2))
                .collect(Collectors.joining(", ", "", "."));

        System.out.println(result);
    }
}
