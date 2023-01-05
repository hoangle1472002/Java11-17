import java.util.List;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("NVA","NVB","NVC");
        List<String> stringList = stringStream.toList();
        for (String s : stringList ) {
            System.out.println(s);
        }

    }
}
