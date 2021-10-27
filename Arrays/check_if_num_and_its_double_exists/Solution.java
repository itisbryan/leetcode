import java.util.*;

/**
 * @author Khoi Nguyen
 */
class Solution {
  public static void main (String args[]) {
    int[] arr = {3,1,7,14};
    // DEBUG
    System.out.println(checkIfExistIfO2N(arr));
    System.out.println(checkIfExistIfOLogN(arr));
  }

  /**
   * Iterating through the array and get rsult
   * @param arr
   * @return
   */
  public static boolean checkIfExistIfO2N(int[] arr) {
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if ((i != j) && (arr[i] * 2 == arr[j])) {
          return true; 
        }
      }
    }
    return false;
  }

  /**
   * Next step, to enhance the time complexity
   * we have: HashSet: O(n) > TreeSet: O(nlogn)
   * @param arr
   * @return
   */
  @SuppressWarnings("rawtypes") 
  public static boolean checkIfExistIfOLogN(int[] arr) {
    
    // TreeSet set = new TreeSet();
    HashSet set = new HashSet();    

    for (int i = 0; i < arr.length; i++) {
      if (isExisted(set, arr[i])) {
        return true;
      }
      set.add(arr[i]);
    }
    return false; 
  }

  /**
   * Check if its double existed by:
   *  1.  Check whether set contained its double by adding earlier
   *  2.  For those don't meet theirs double, check if set contained theirs num divided by 2
   * @param set
   * @param num
   * @return result of condition
   */
  @SuppressWarnings("rawtypes")
  private static boolean isExisted(Set set, int num) {
    return set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2));
  }
}
