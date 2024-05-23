/*
This block of code converts a float variable to an int variable with the (int) daysFloat.
***Important*** when converting a float to an int, it will round down
It also converts a String to an int using the Integer.parseInt(var) name
 */
class convert
{
    public static void main(String[] args) {
        float daysFloat = 365.25f;
        String weeksString = "52";
        int daysInt = (int) daysFloat;
        int weeksInt = Integer.parseInt(weeksString);
        int week = (daysInt / weeksInt);
        System.out.println("Days in a week: " + week);
    }
}
/*
This code creates a new array called str that holds the stuff in the curly braces ({})
It also creates an array called num with 3 empty indexes. ***Important*** Indexes start at 0
It adds 100 and 200 to index [0] and index [1]
It then prints everything out
 */
class Array
{
    public static void main(String[] args) {
        String[] str = {"Much ", "More", " Java"};
        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;
        str[1] = "Better";
        System.out.println("String array length is " + str.length);
        System.out.println("Int array length is " + num.length);
        System.out.println(num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println(str[0] + str[1] + str[2]);
    }
}
/*
This code sets the args to what you put it as. It must be run in the terminal for it to work.
Steps for running:
1. type cd src and click enter
2. Compile Option: type javac Chapter4.java to compile the code
3. Type java Option ____ (add an argument for args[0]) in the terminal to test
 */
class Option
{
    public static void main(String[] args) {
        if (args[0].equals("-en"))
        {
            System.out.println("English Option");
        } else if (args[0].equals("-es"))
        {
            System.out.println("Spanish Option");
        } else
        {
            System.out.println("Unrecognized option");
        }
    }
}

class Args {
    public static void main(String[] args) {
        if(args.length !=3)
        {
            System.out.println("Wrong Number of Arguments!");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        String msg = args[0] + args[1] + args[2] + "=";
        if (args[1].equals("+")){
            msg += (num1 + num2);
        } else if (args[1].equals("-")) {
            msg += (num1 - num2);
        } else if (args[1].equals("x")) {
            msg += (num1 * num2);
        } else if (args[1].equals("/")){
            msg += (num1 / num2);
        } else msg = "Incorrect Operator";
        System.out.println(msg);
    }
}