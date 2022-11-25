//Дано четное число N (>0) и символы с1 и с2
//Написать метод, который вернет строку длинны N, которая 
//состоит из чередующихся символов с1 и с2, начиная с с1


public class task7 {
    public static String generString(char c1, char c2, int length){
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < length/2;i++)
            builder.append(new char[]{c1,c2});
        return builder.toString();
    }
    public static void main(String[] args){
        String result = generString('a', 'b', 10);
        System.out.println(String.format("Generated string: %s", result));
    }
}
