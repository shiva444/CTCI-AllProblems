import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* Write a method to sort an array of strings so that all the anagrams are next to
        each other.
        */
public class GroupAnagrams {
    //Using HashMap
    static void sortingString(String arr[]){
        HashMap<String, List<String> > map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            } else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
        for (String s: map.keySet()) {
            List<String> val = map.get(s);
            if(val.size() > 1){
                System.out.println(val);
            }
            //print non anagrams
            if(val.size() == 1){
                System.out.println("Non anagrams :" + val);
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = { "cat", "dog", "tac", "god", "act" };
        sortingString(arr);
    }

}
