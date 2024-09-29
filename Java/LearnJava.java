public class LearnJava {

    public static void main(String[] args) {
        String name = "Susan";
        Animal a = new Animal();

        System.out.println(name.toLowerCase());
        addExclemationPoint(name);

        String dog = a.iAmDog();
        System.out.println(dog.toUpperCase());
    }

    public static void addExclemationPoint(String s) {
        System.out.println(s.toUpperCase() + "!");
    }
}