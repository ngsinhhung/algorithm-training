
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<String, Integer> symbolMapValue = new HashMap<>();
        symbolMapValue.put("I", 1);
        symbolMapValue.put("V", 5);
        symbolMapValue.put("X", 10);
        symbolMapValue.put("L", 50);
        symbolMapValue.put("C", 100);
        symbolMapValue.put("D", 500);
        symbolMapValue.put("M", 1000);

        String[] romanSplit = s.split("");
        int rs = 0;
        for (int i = 0; i < romanSplit.length; i++) {
            int num;

            if(i == romanSplit.length - 1){
                num = symbolMapValue.get(romanSplit[i]);
            } else {
                if(symbolMapValue.get(romanSplit[i]) >= symbolMapValue.get(romanSplit[i + 1])){
                    num = symbolMapValue.get(romanSplit[i]);
                } else {
                    num = symbolMapValue.get(romanSplit[i]) * -1;
                }
            }

            rs += num;
        }

        return rs;
    }

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("MCMXCIV"));
    }

}
