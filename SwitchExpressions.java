public class SwitchExpressions {
    enum Fruit{
        APPLE,
        PEAR,
        ORANGE,
        AVOCADO
    }
    private static void oldStyleWithoutBreak(Fruit fruit) {
        System.out.println(
                switch (fruit) {
                    case APPLE, PEAR -> "Common fruit";
                    case ORANGE, AVOCADO-> "Exotic fruit";
                    default-> "Another fruit";
                }
        );
    }

    public static void main(String[] args) {
        oldStyleWithoutBreak(Fruit.AVOCADO);
    }
}
