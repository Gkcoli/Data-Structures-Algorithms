import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedList<String> linkList = new LinkedList<String>();

        // linkList.push("A");
        // linkList.push("B");
        // linkList.push("C");
        // linkList.push("D");
        // linkList.push("E");
        // linkList.push("F");
        // linkList.pop();

        linkList.offer("A");
        linkList.offer("B");
        linkList.offer("C");
        linkList.offer("D");
        linkList.offer("E");
        linkList.offer("F");
        // linkList.poll();
        
        //Input this if you want to add
         linkList.add("G");
        
        //Put this if you want to delete Letter G on the list
        linkList.remove("G");

        System.out.println(linkList);
   }
}
