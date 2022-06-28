import java.util.Iterator;
import java.util.stream.Stream;

public class Exercise5<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> resultStream = Stream.empty();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }
        return resultStream;
    }

    public static void main(String[] args) {

        zip(Stream.of("A", "B", "C", "D"), Stream.of("1", "2", "3", "4", "5", "6", "7"))
                .forEach(System.out::print);
    }
}
