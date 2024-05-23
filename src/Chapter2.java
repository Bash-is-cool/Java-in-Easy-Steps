/*
The below code creates 3 integers and sets them equal to 100, 20, and 0. It then adds, subtracts, multiplys, and divides num and factor and sets it equal to sum.
*/
class arithmetic
{
    public static void main(String[] args)
    {
        int num = 100;
        int factor = 20;
        int sum = 0;
        System.out.println(sum = num + factor);
        System.out.println(sum = num - factor);
        System.out.println(sum = num * factor);
        System.out.println(sum = num / factor);
    }
}
/*
Below, 2 strings are created and added together and set equal to txt. The same thing happens with the 2 int variables.
*/
class assigningValues
{
    public static void main(String[] args)
    {
        String txt = "Super ";
        String lang = "Java";
        txt += lang;
        System.out.println(txt);
        int sum = 10;
        int num = 20;
        sum += num; //+= adds the values and assigns the sum to the first variable
        System.out.println(sum);
    }
}
/*
below, Booleans result to result6 are created and set equal to something. yes and no = true and false respectively.
*/
class assessingLogic
{
    public static void main(String[] args)
    {
        boolean yes = true, no = false; // Creates yes and no
        boolean result = (yes && yes); // && checks to see if both arguments are true
        System.out.println(result);
        boolean result2 = (yes && no);
        System.out.println(result2);
        boolean result3 = (yes || yes); // || checks to see if either are true
        System.out.println(result3);
        boolean result4 = (yes || no);
        System.out.println(result4);
        boolean result5 = (no || no);
        System.out.println(result5);
        boolean result6 = yes;
        System.out.println(result6);
        result6 = !yes; // ! changes the result to the opposite. In this case, since yes = true, yes becomes false
        System.out.println(result6);
    }
}
/*
The code below creates 2 numbers and 2 result variables. the % (modulus) takes the remainder. ? : tells us if true, then print "Odd". If false then print "Even".
*/
class examiningConditions
{
    public static void main(String[] args)
    {
        int num1 = 1357, num2 = 2468;
        String result, result2;
        System.out.println(result = (num1 % 2 != 0) ? "Odd" : "Even");
        System.out.println(result2 = (num2 % 2 != 0) ? "Odd" : "Even");
    }
}
class settingPrecedence
{
    // Parenthesis Show what will be evaluated first. Order of Operations applies
    public static void main(String[] args)
    {
    int sum = 32 - 8 + 16 * 2;
        System.out.println(sum);
        sum = (32 -8 +16) * 2;
        System.out.println(sum);
        sum = (32 - (8 + 16)) * 2;
        System.out.println(sum);
    }
}
/*
\ Is the escape operator. it adds a special character to the line of code. \n is new line. \t is tab or indent.
*/
class escape
{
    public static void main(String[] args)
    {
    String header = "\n\tNEW YORK 3-DAY FORECAST:\n";
    header +="\n\tDay\t\tHigh\tLow\tConditions\n";
    header +="\t---\t\t----\t---\t----------\n";
    String forecast = "\tSunday\t\t68F\t48F\tSunny\n";
    forecast += "\tMonday\t\t69F\t57F\tSunny\n";
    forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";
    System.out.print(header + forecast);

    }
}
/*
BitWise is rarely used and very hard to understand. Below is an example but for a more in depth lesson on it. Read Java in Easy Steps or search it up.
*/
class bitwise
{
    public static void main(String[] args)
    {
    byte fs = 53; //Combined flag status of 00110101
        System.out.println("Flag 1:" +(((fs&1) > 0) ? "ON" : "off"));
        System.out.println("Flag 2:" +(((fs&2) > 0) ? "ON" : "off"));
        System.out.println("Flag 3:" +(((fs&4)> 0) ? "ON" : "off"));
        System.out.println("Flag 4:" +(((fs&8) > 0) ? "ON" : "off"));
        System.out.println("Flag 5:" +(((fs&16) > 0) ? "ON" : "off"));
        System.out.println("Flag 6:" +(((fs&32) > 0) ? "ON" : "off"));
        System.out.println("Flag 7:" +(((fs&64) > 0) ? "ON" : "off"));
        System.out.println("Flag 8:" +(((fs&128) > 0) ? "ON" : "off"));
    }
}
