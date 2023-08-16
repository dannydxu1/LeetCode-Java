import java.util.*;

public class check_record {
    public boolean checkRecord(String s) {
        //cant be absent (A) for > 2 days total
        //cant be late (L) for >= 3 days in a row
        // O(N) solution: iterate across arr, add each value to a hashmap <char letter, int occurences>, then return        boolean
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('A', 0);
        hs.put('P', 0);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 'L'){
                int count = 0;
                int ind = i;
                ind=0;
                while (ind < arr.length && ind < i+2){ 
                    if (arr[ind] == 'L'){
                        count++;
                    } 
                    ind++; //ind = 1
                }
                if (count >= 3){
                    return false;
                }

            } else{
                if (hs.containsKey(arr[i])) {
                    //char already exists in the array, so increment
                    hs.put(arr[i], hs.get(arr[i])+1);
                } else { //add char to array for first time
                    hs.put(arr[i], 1);
                }
            }
           
        }
        //return True if A<=2 and L <3
       System.out.println("#A"+hs.get('A'));
        return (hs.get('A')<2);
    }
    
}
