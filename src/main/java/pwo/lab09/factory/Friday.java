package pwo.lab09.factory;

/**
 * @author Aleksandr Kovalyov
 */
public class Friday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Piątek, Piąteczek, Piątunio.";
    }

    @Override
    public String createMainMessage() {
        return "Nie chcę pracować.";
    }

    @Override
    public String createClosingMessage() {
        return "Już weekend.";
    }
}