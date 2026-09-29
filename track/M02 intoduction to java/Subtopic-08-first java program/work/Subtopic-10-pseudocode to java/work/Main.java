public class Main {
    public static void main(String[] args) {
        int javaHoursPerDay = 2;
        int aptiHoursPerDay = 1;
        int numberOfDays = 5;

        int weeklyJavaHours = javaHoursPerDay * numberOfDays;
        int weeklyAptiHours = aptiHoursPerDay * numberOfDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptiHours;

        System.out.println("Java: " + weeklyJavaHours);
        System.out.println("Aptitude: " + weeklyAptiHours);
        System.out.println("Total: " + totalPreparationHours);
    }
}