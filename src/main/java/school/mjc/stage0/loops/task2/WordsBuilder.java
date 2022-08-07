package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        int length = 0;
        String result = "";
        while(length < chars.length) {
            if(chars[length] == ' ' && length != chars.length -1) {
                result +=' ';
            } else {
                result += chars[length];
            }
            length++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
