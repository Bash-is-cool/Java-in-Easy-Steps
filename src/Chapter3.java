/*
If statements check to see if something is true. If it is, then it will run what is in its curly braces. If false, it will skip over the code block
*/
class If
{
    public static void main(String[] args) {
        int num = 8;
        if (5 > 1) System.out.println("Five is greater than One.");
        if (2 < 4)
        {
            System.out.println("Four is Greater than Two.");
            System.out.println("Test Succeeded.");
        }
        if (((num > 5) && (num < 10)) || (num == 12)) System.out.println("Number is 6-9 inclusive, or 12"
        );
    }
}
/*
Else if adds on to the if statements. It runs the code in its curly braces if the statement in its parenthesis is true.
*/
class Else
{
    public static void main(String[] args) {
        int hrs = 15;
        if (hrs < 13)
        {
            System.out.println("Good Morning: " + hrs);
        } else if (hrs < 18) {
            System.out.println("Good Afternoon: " + hrs);
        }
    }
}
/*
Switch runs through multiple cases until it finds one that is true and runs the code that follows it. Each Case must be followed by a break keyword. if code is not, it will run
the next cases code.
*/
class Switch
{
    public static void main(String[] args) {
        int month = 2, year = 2024, num =31;
        switch (month)
        {
            case 4 : case 6 : case 9 : case 11 : num = 30; break;
            case 2 : num = (year % 4 == 0) ? 29 : 28; break;
        }
        System.out.println(month + "/" + year + "/" + num + " days");
    }
}
/*
For is a type of loop. it creates an iteration value (Usually called i) and runs until the second section is met. the third section in a for statement adds 1 to the iterator so you
don't get an infinite loop. for loops can be put inside other loops like shown below.
*/
class For
{
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <4; i++)
        {
            System.out.println("Outer Loop i = " + i);
            for ( int j = 1; j < 4; j++)
            {
                System.out.print("\tInner Loop j = " + j);
                System.out.println("\t\tTotal num = " + (++ num));
            }
        }
    }
}

class While
{
    public static void main(String[] args) {
        int num = 100;
        while (num > 0)
        {
            System.out.println("While Countdown: " + num);
            num -= 10;
        }
    }
}

class DoWhile
{
    public static void main(String[] args) {
        int num = 100;
        do
        {
            System.out.println("DoWhile Countup: " + num);
            num += 10;
        }
        while (num < 10);
    }
}

class Break
{
    public static void main(String[] args) {
        for ( int i = 1; i < 4; i++)
        {
            for (int j =1; j < 4; j++)
            {
                if (i == 1 && j == 1)
                {
                    System.out.println("Continues innerLoop when i = " + i + " j = " + j);
                    continue;
                }
                if ( i == 2 && j == 1)
                {
                    System.out.println("Breaks innerLoop when i = " + i + " j = " + j);
                    break;
                }
                System.out.println("Running i = " + i + " j = " + j);
            }
        }
    }
}

class Label
{
    public static void main(String[] args) {
       outerLoop : for (int i = 1; i < 4; i++)
        {
            for (int j = 1; j < 4; j++)
            {
                System.out.println("Running i = " + i + " j = " + j);
                if (i == 1 && j == 1)
                {
                    System.out.println("Continues outerLoop when i = " + i + " j = " + j);
                    continue outerLoop;
                    //Works for the break statement too
                }
            }
        }
    }
}
