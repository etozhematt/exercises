
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toSet;

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("Matthew", "Griroriy", "John", "Vasya", "Soul", "Hendrix");
        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        return stringStream.filter(e -> e.length() > 6).collect(toSet());
    }
}
