package pwo.lab09.factory;

/**
 * @author Aleksandr Kovalyov
 */
public class Sunday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Lubię niedzielę.";
    }

    @Override
    public String createMainMessage() {
        return "Idę na spacer.";
    }

    @Override
    public String createClosingMessage() {
        return "Muszę wyspać się.";
    }
}