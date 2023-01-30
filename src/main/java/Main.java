public class Main {
    public static void main(String[] args) {
        AgenteBolsa agente = new AgenteBolsa();
        agente.addObserver(new AgenciaBolsa());
        agente.addObserver(new AgenciaBolsa());
        agente.addObserver(new AgenciaBolsa());

        agente.checkPrice(0);
        agente.checkPrice(10);
    }
}
