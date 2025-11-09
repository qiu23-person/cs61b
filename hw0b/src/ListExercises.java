import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if(L.isEmpty())  return 0;
        int count=0;
        for(int elem : L){
          count+=elem;
        }
        return count;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> enve =new ArrayList<>();
        for(int elem :L ){
            if(elem % 2==0){
                enve.add(elem);
            }
        }
        return enve;
    }
     //use room replace time
    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
          List<Integer> lst=new ArrayList<>();
          for(int elem1 : L1) {
              for (int elem2 : L2) {
                  if (elem1==elem2 && !lst.contains(elem2)) {
                      lst.add(elem2);
                      break;
                  }
              }
          }
          // if the lst  don’t add anything,this is empty
          return lst;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count=0;
        for(String elem: words) {
            for (int i = 0; i < elem.length(); i++) {
                if (elem.charAt(i) == c)
                    count++;
            }
        }
        return count;
    }
}
