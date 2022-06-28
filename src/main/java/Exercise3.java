import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.asList;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> input = asList("1, 2, 0", "4, 5");

        String numbers = input.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        String result = Stream.of(numbers
                        .split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "", "."));

        System.out.println(result);
    }
}
