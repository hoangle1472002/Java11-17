public class TextBlock {
    public static void main(String[] args) {
        String text = """
                  "name": "John Doe",
                  "age": 45,
                  "address": "Doe Street, 23, Java Town"
                  %s,%f,%s
                """.formatted("abc",10.4,"bcd");
        System.out.println(text);
    }
}
