
public class PatternMatchingForInstance {
    public record GrapeClass(String color,Integer length){}
    public static void main(String[] args) {
        Object o = new GrapeClass("BLUE", 2);
        if (o instanceof GrapeClass grape) {
            System.out.println("This grape has " + grape.toString() + " !");
        }
        else{
            System.out.println("Do not match type of Object !");
        }
    }
}
