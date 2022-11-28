import java.util.Arrays;

public class task10hw {
    /**
     * @param args
     */
    public static void main(String[] args){
        int[] array = {8, 8, 3, 2, 1, 22, 3, 6, 40, 5, 33, 18}; 
        int temp;                                               
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {                      
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
            
    }
}

