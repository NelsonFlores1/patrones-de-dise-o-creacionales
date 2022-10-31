// Singleton perzoso
// solo entornos de un solo hilo. para que se compruebe que solo hay un hilo
// aplicar este codigo
public class ThreeSaveSingleton {
    private static ThreeSaveSingleton instance;

    private ThreeSaveSingleton() {
    }

    public static synchronized ThreeSaveSingleton getInstance() {
        if(instance == null){
            instance = new ThreeSaveSingleton();
        }
        return instance;
    }
}
