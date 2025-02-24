
/*
 * pseudocode:
 * 
 * class pairs{
 *  function{
 *      int[] row
 *      int swaps
 * 
 *      for i in row.length, i+=2{
 *          int x = row[i]
 *          int y
 *          
 *          if(x is even){
 *              y = x + 1
 *          }
 *          else{
 *              y = x - 1
 *          }
 *          
 *          if(next index != y){
 *              swaps++
 *              for j (starting at i+2) in row.length, j++{
 *                  if row[j] = y{
 *                      int temp = row[i + 1]
                        row[i + 1] = row[j]
                        row[j] = temp
                        break
 *                  }
 *              }
 * 
 *          }
 *      
 *      }
 * 
 * print result
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 */




public class pairs{
    public static void main(String[] args) {
        //make test array
        int[] row = {0,2,3,1};
        //track number of swaps
        int swaps = 0;
        //for loop that traverses array row in intervals of 2
        for(int i = 0; i < row.length; i+=2){
            //set index elements to variables for comparison, x is first number in pair and y is the second
            int x = row[i];
            int y;

            //if x is even
            if(x % 2 == 0){
                //its paired y var should be 1 more than x
                y = x + 1;
            }
            else{
                //if not then the paired y var should be 1 less
                y = x - 1;
            }
            //if index next to x is not expected pairing
            if(row[i + 1] != y){
                //inc number of swaps needed
                swaps++;
                //for loop to search remainder of the array for paired variable
                for(int j = i + 2; j < row.length; j++){
                    //if index = expected pairing for x
                    if(row[j] == y){
                        //hold the index of i + 1(where x's paired var should be) in a temp
                        int temp = row[i + 1];
                        //move correct number into correct spot
                        row[i + 1] = row[j];
                        //move incorrect number to correct number's previous spot
                        row[j] = temp;

                        break;
                    }
                }
            }

        }
        //print the number of swaps needed
        System.out.println(swaps);
    }

    
}