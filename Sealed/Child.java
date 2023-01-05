package Sealed;

public final class Child extends Supper {
    protected String Hello(){
        return """
                    Hello World !
                    Child class is here !                
                """;
    }

    public static void main(String[] args) {
        Supper supper = new Supper();
        System.out.println(supper.Hello());

        Supper child = new Child();
        System.out.println(child.Hello());
    }
}
