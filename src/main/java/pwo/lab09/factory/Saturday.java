package pwo.lab09.factory;

/**
 * @author Aleksandr Kovalyov
 */
public class Saturday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Mogę spać długo.";
    }

    @Override
    public String createMainMessage() {
        return "W sobotę sprzątam";
    }

    @Override
    public String createClosingMessage() {
        return "Szósty dzień w tym tygodniu minął";
    }
}