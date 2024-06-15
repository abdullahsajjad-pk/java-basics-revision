public class object_oriented_lang_class {
    // by using static you don't have to create object of class to use functions
    // by using public you will access to these functions and variables in other classes

    public static String name;
    public static int age;


    public static void execute(String nameFunc, int ageFunc) {
        System.out.println(nameFunc + ": " + ageFunc);
    }
}
