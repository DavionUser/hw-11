import java.util.stream.Stream;

public class Exercise4 {
    public static Stream<Long> formula(long a, long c, long m, long seed) {

       return Stream.iterate(seed, f -> f + (a * f + c) % m);
    }
    public static void main(String[] args) {
        formula(25214903917L, 11, 2^48, 1)
                .forEach(System.out::println);
    }
}

