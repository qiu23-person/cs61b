import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */

    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        int number=1;
        Map<Character,Integer>map=new TreeMap<>();
        for(char a='a';a<='z';a++){
            map.put(a,number++);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer>map=new TreeMap<>();
        if(nums.isEmpty()) return null;
        else{
            for(int elem : nums){
                map.put(elem,elem*elem);
            }
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String,Integer> map=new TreeMap<>();
        if(words.isEmpty()) return null;
        else{
            for(String elem:words){
                if(!map.containsKey(elem)){
                map.put(elem, 1);
                }
                else{
                    map.put(elem,map.get(elem)+1);
                }
            }

        }
        return map;
    }
}
