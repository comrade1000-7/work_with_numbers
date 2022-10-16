import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    private List<Integer> list;

    public StreamMain(List<Integer> list) {
        this.list = list;
    }

    public void filterByStream (List<Integer> list) {
        Stream<Integer> stream = list.stream();
        list.stream()
                    .filter(x -> x > 0)
                    .filter(x -> x % 2 == 0)
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
    }
}
