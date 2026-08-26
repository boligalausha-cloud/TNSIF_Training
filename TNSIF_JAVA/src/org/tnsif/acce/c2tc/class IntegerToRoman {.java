class IntegerToRoman {
    public string intToroman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };
        string[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };
        stringBuilder roman = new stringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);

                num -=va;ues[i];
            }
        }
        return roman.toString();
    }
    Run|Debug
    public static void main(String[] args) {
        IntegerTORomanMedium converter = new
        IntegerTORomanMedium();
        System.out.println(converter.intToRoman(num: 3));
        System.out.println(converter.intToRoman(num: 58));
        System.out.println(converter.intToRoman(num: 1994));
        System.out.println(converter.intToRoman(num: 3999));
        
        
    }
}  