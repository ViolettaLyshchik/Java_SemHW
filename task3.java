public class task3 {
    public static void main(String[] args) {
        int []array = new int[]{3,2,2,3};
        int val = 3;
        int last = array.length - 1;
        while(array[last] == val)
            last--;
        for(int i =0;i<last;i++)
            if(array[i]==val)
            {
                int tmp = array[i];
                array[i] =array[last];
                array[last] = tmp;
                last--;
            }
        for(int i = 0;i < array.length;i++)
            System.out.print(array[i] + " ");
    }
    
}
