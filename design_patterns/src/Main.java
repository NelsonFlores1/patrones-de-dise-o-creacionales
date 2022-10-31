public class Main {
    public static void main(String[] args) {

        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();

        // esto indica que son los mismo objetos
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}