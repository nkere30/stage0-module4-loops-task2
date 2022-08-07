package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        int length = 0;
        String result = "";
        while(length < chars.length) {
            if(chars[length] == ' ') {
                result +=' ';
            } else {
                result += chars[length];
            }
            length++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        buildPhrase('H', 'e', 'l', 'l', 'o', ',', ' ' , 'W', 'o', 'r', 'l', 'd', '!');
    }
}
