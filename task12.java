import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task12 {
    private static void printArray(List<Integer> list){
        for(Integer element : list)
            System.out.print(String.format("%d ", element));
            System.out.println();    
    }
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(random.nextInt(20));
        System.out.print("Your generated array: ");
        printArray(list);
        list.sort(null);
        System.out.print("Your sorted array: ");
        printArray(list);
    }
}
