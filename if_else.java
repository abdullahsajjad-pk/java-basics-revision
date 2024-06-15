public class if_else {
    private static void validator(String name, int age, char countryInitial) {
        if (name.length() >= 3 && age >= 18 && countryInitial >= 'P') {
            System.out.println("You're fully qualified for your Driver's License");
        } else {
            System.out.println("You're not qualified for your Driver's License");
        }
    }
    public static void main(String[] args) {
        validator("Abd", 18, 'P');
    }
}
