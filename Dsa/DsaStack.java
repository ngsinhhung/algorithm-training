import java.util.Stack;

public class DsaStack {

    public static void main(String[] args) {
        Stack<String> games = new Stack<>();

        games.add("Minecraft");
        games.add("GtaIV");
        games.add("GtaV");

        // String popStack = games.pop();
        // String xxx = games.peek();

        // System.out.println(popStack);
        System.out.println(games);
        // System.out.println(xxx);

        System.out.println(games.search("Minecraft"));

    }

}
