// Singleton perzoso
// solo entornos de un solo hilo.
// pero este no comprueba si tiene mas de un hilo
public class LazySingleton {

    // the constructor must be PRIVATE,
    private static LazySingleton instance;
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
