package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
                'R', 'S', 'T', 'V', 'W', 'X', 'Z', 'r'};
        boolean isVowel = false;
        for (char c : vowels) {
            if (symbol == c) {
                isVowel = true;
            }
        }
        if (isVowel) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
