import java.util.*;
public class task16hw {
    public static void main(String[] args)
    {
        LinkedList<String> linkedli = new LinkedList<String>();
        linkedli.add("Blue");
        linkedli.add("Red");
        linkedli.add("Green");
        linkedli.add("yellow");
        System.out.print("Элементы до реверса: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print(" Элементы после реверса: " + linkedli);
}

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {   
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}