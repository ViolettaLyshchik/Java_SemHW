//Напишите метод, который сжимает строку

public class task8 {
    public static void main(String[] args){
        String string = "aaaabbbcdd";
        StringBuffer resultString = new StringBuffer();
        for(int i=0; i<string.length();i++){
            int count=1;
                while(i+1 <string.length() && string.charAt(i+1)== string.charAt(i)){
                    count+=1;
                    i +=1;
                }
                resultString.append(string.charAt(i));
                if(count >1)
                    resultString.append(count);
        }
        System.out.println(resultString);
    }
    
}
