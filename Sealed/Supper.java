package Sealed;

public sealed class Supper
    permits Child
    //Another class is not allowed to extend this class
{
    protected String Hello(){
        return """
                    Hello World !
                    Supper class is here !                
                """;
    }
}
