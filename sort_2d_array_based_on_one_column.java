import java.util.Arrays;
import java.util.Comparator;

public class Asdf {

    public static void main(final String[] args) {
        final String[][] data = new String[][] {
                new String[] { "2009.07.25 20:24", "Message A" },
                new String[] { "2009.07.25 20:17", "Message G" },
                new String[] { "2009.07.25 20:25", "Message B" },
                new String[] { "2009.07.25 20:30", "Message D" },
                new String[] { "2009.07.25 20:01", "Message F" },
                new String[] { "2009.07.25 21:08", "Message E" },
                new String[] { "2009.07.25 19:54", "Message R" } };


// copy this from here
//ascending order

        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[0];
                final String time2 = entry2[0];
                return time1.compareTo(time2);
            }
        });
        
//till here

        for (final String[] s : data) {
            System.out.println(s[0] + " " + s[1]);
        }
    }

}

/* output
2009.07.25 19:54 Message R
2009.07.25 20:01 Message F
2009.07.25 20:17 Message G
2009.07.25 20:24 Message A
2009.07.25 20:25 Message B
2009.07.25 20:30 Message D
2009.07.25 21:08 Message E
*/


/// int 2d array sort by columns here!!! ///
public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    } 
 //////////////////////////////////////////////////////
