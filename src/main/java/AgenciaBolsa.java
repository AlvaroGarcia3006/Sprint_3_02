import java.util.Observable;
import java.util.Observer;


// Clase concreta Observer
public class AgenciaBolsa implements Observer {
    public AgenciaBolsa(){}
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Recibido");
    }
}