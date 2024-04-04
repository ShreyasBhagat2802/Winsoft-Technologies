import java.util.*;

class Question_3 {
    public static void main(String[] args) throws Exception {
        String str = "My name is Shreyas Bhagat";

        Map<String, Integer> map = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            Integer Counter = map.get(word);
            if (Counter == null) {
                Counter = 0;
            }
            map.put(word, Counter + 1);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println(map);
    }
}