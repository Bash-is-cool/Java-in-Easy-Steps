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
