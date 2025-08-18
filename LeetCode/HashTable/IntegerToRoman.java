
public class IntegerToRoman {
    // public String intToRoman(int num) {
    //     Integer numInteger = Integer.valueOf(num);
    //     Map<String, Integer> symbolMapValue = new LinkedHashMap<>();
    //     symbolMapValue.put("M", 1000);
    //     symbolMapValue.put("CM", 900);
    //     symbolMapValue.put("D", 500);
    //     symbolMapValue.put("CD", 400);
    //     symbolMapValue.put("C", 100);
    //     symbolMapValue.put("XC", 90);
    //     symbolMapValue.put("L", 50);
    //     symbolMapValue.put("XL", 40);
    //     symbolMapValue.put("X", 10);
    //     symbolMapValue.put("IX", 9);
    //     symbolMapValue.put("V", 5);
    //     symbolMapValue.put("IV", 4);
    //     symbolMapValue.put("I", 1);

    //     StringBuilder rs = new StringBuilder();

    //     for(Map.Entry<String, Integer> elem : symbolMapValue.entrySet()){
    //         if((numInteger / elem.getValue()) != 0){
    //             int count = numInteger / elem.getValue();
    //             int i = 0;
    //             while(i < count){
    //                 rs.append(elem.getKey());
    //                 i++;
    //             }
    //             numInteger = numInteger % (elem.getValue() * count);
    //         }

    //     }
    //     return rs.toString();
    // }

    public String intToRoman(int num) {
        int [] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]){
                rs.append(symbols[i]);
                num-=values[i];
            }
        }
        return rs.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman ior = new IntegerToRoman();
        System.out.println(ior.intToRoman(3479));
    }


    

}
