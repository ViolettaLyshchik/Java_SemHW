import java.util.HashMap;



public class task17 {
    public static void main(String[] args) {
        HashMap<Integer, String> peoples = new HashMap<>();
        peoples.put(123456,"Ivanov");
        peoples.put(123548,"Vasiliev");
        peoples.put(845756,"Petrova");
        peoples.put(564785,"Ivanov");
        peoples.put(365894,"Ivanov");
        peoples.put(856422,"Petrova");
        for(var entry: peoples.entrySet())
        {
            if(entry.getValue().equals("Ivanov"))
                System.out.println(String.format("%d %s",entry.getKey(), entry.getValue()));
        }
    }
}
