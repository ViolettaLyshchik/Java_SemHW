import java.util.HashSet;
import java.util.Random;

public class task19 {
    private static int[] createArray()
    {
        int[] array = new int [1000];
        Random random = new Random();
        for(int i=0; i<array.length;i++)
            array[i] = random.nextInt(24);
        return array;
    }
    private static int countUniques(int [] array) {
        HashSet<Integer> uniques = new HashSet<>();
        for(int element : array)
            uniques.add(element);
        return uniques.size();
        
    }
    
    public static void main(String[] args) {
        int[] array = createArray();
        int uniques = countUniques(array);
        System.out.println(String.format("Persent of uniques numbers: %f",(float) uniques*100/ (float)array.length));
    }
}
