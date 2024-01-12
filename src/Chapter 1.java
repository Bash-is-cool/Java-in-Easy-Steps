class Hello
{
public static void main ( String[] args )
{
    System.out.println("Hello World");
}
}
class FirstVariable
{
    public static void main(String[] args)
    {
    String message = ("Initial Value");
    System.out.println(message);
    message = ("Modified Value");
    System.out.println(message);
    }
}
class DataTypes
{
    public static void main(String[] args)
    {
    char letter = 'a';
    String title = "Java in Easy steps";
    int number = 365;
    float decimal = 98.6f;
    boolean result = true;
        System.out.println("Initial is " + letter);
        System.out.println("Book is " + title);
        System.out.println("Days are " + number);
        System.out.println("Temperature is " + decimal);
        System.out.println("Answer is " + result);
    }
}
class Constants
{
    public static void main(String[] args) {
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;
        int td, pat, fg, total;
        td = 4*TOUCHDOWN;
        pat = 3*CONVERSION;
        fg = 2*FIELDGOAL;
        total = (td + pat + fg);
        System.out.println("Score: "+total);
    }
}
// This is a single line Comment
/*
This is a comment that goes more than one line
 */