// eager - impaciente
public class ESingleton {
    private static ESingleton instance = new ESingleton();
    private ESingleton(){

    }

    public static ESingleton getInstance() {
        return instance;
    }
}
