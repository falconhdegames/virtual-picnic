import java.util.HashMap;

public class Finder {
    public Input input;
    public Finder(Input input) {
        this.input = input;
    }
    public int findLength() {
        return this.input.splitted.length;
    }
    public String findLongest() {
        String longest = "";
        for (String word : this.input.splitted) {
            if (word.length() > longest.length()) {longest = word;}
        }
        return longest;
    }
    public void wordAmount() {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : this.input.splitted) {
            if (hm.containsKey(word)) {hm.put(word, hm.get(word)+1);}
            else {hm.put(word, 1);}
        }
        for (String key : hm.keySet()) {
            System.out.printf("Слово \"%s\" встречалось %s раз", key, hm.get(key));
        }
    }
}
