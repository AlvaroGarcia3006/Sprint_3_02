import java.util.Observable;

// Clase Observable
public class AgenteBolsa extends Observable {
    int current_price = 0;
    public AgenteBolsa(){}
    // Método que cambia el estado del objeto observado
    public void checkPrice(int price) {
        if(price != current_price){
            setChanged();
            notifyObservers();
        }
    }
}
