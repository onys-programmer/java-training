public class MessageThrower {
    public static String greetWithPlayerName(String inputValue) {
        String playerName = inputValue;

        MessageThrower.greetWithPlayerName(playerName);

        return "Hello " + playerName;
    }
}
