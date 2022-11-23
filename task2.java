public class task2 {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 1, 0, 1, 1, 1};
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while(i<arr.length && arr[i]==1){
                count++;
                i++;
            }
            if (count > max)
                max = count;
            count = 0;
        }
        System.out.println(max);
    }
}
