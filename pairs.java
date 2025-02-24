
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
        int[] row = {0,2,3,1};
        int swaps = 0;

        for(int i = 0; i < row.length; i+=2){
            int x = row[i];
            int y;

            if(x % 2 == 0){
                y = x + 1;
            }
            else{
                y = x - 1;
            }

            if(row[i + 1] != y){
                swaps++;

                for(int j = i + 2; j < row.length; j++){
                    if(row[j] == y){
                        int temp = row[i + 1];
                        row[i + 1] = row[j];
                        row[j] = temp;
                        break;
                    }
                }
            }

        }
        System.out.println(swaps);
    }

    
}