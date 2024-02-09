//BEFORE STARTING: Download a Java IDE like Intellij or Android Studio



// The following code is everything that is contained insie Java in Easy Steps by Mike Mcgrath. Before starting, read the comments to understad the code

//NOTE: It is Important to always add semi colons to the end of your code Unless it is following a curly brace.

/*
This code creates a class called Hello. Inside it has a main method. This method allows all the code inside its curly braces to run. inside these braces,
We use System.out.println() to print the message Hello World.
***Important*** if you try to use a string data type, you must use double qoutes.
*/
class Hello
{
public static void main ( String[] args )
{
    System.out.println("Hello World");
}
}
/*
This creates a variable called message of the String data type and sets it equal to "Initial value". It then prints message to the terminal.
After it prints, it changes message and sets it equal to "Modified Value". It then prints it to the Terminal.
*/
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
/*
In java, there are multiple different daa types you can use to declare variables. Below, it ccreates a variable with each one and prints it.
Char: One character. surronded by single qoutes(''). String: Words. Surronded by double qoutes(""). int: Numbers. Short for Integer. float: Decimals. Boolean: True or false.
*/
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
/*
This code uses the final keyword to lock the variables as those asigned values. If you try to change these values later, you will get an error.
*/
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
