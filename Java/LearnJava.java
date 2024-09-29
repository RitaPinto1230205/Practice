public class LearnJava {

    public static void main(String[] args) {
        String name = "Susan";

        System.out.println(name.toLowerCase());
        addExclemationPoint(name);
    }

    public static void addExclemationPoint(String s) {
        System.out.println(s.toUpperCase() + "!");
    }
}