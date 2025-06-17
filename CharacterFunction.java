public class CharacterFunction {
    public static void main(String[] args){
        char ch1 = ' ';
        System.out.println(Character.isWhitespace(ch1));
        char ch2 = '@';
        System.out.println(Character.isAlphabetic(ch2));
        char ch3 = '9';
        System.out.println(Character.isDigit(ch3));
        char ch4 = 'S';
        System.out.println(Character.isLetter(ch4));

    }
}
