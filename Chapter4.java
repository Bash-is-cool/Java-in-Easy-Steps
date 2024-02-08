class convert
{
    public static void main(String[] args) {
        float daysFloat = 365.25f;
        String weeksString = "52";
        int weeksInt = (int) daysFloat;
        int weeksInt = Integer.parselInt(weeksString);
        int week = (daysInt / weeksInt);
        System.out.println("Days in a week: " + week);
    }
}