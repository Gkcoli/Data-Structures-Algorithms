import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App{
  public static void main(String[] args) {
    //created a stack
    Stack<Integer> s1=new Stack<>();
    //inserting element into stack
    s1.push(2);
    s1.push(4);
    s1.push(9);

    System.out.println(s1);
    //delete operation on stack
    // s1.pop();
    System.out.println(s1);
    // s1.pop();
    // System.out.println(s1);

    //peek operation
    System.out.println(s1.peek());
    // s1.pop();
    // s1.pop();
    boolean status = s1.empty();
    System.out.println(status);

    // int indexfound = s1.search(4);
    // System.out.println(indexfound);
    // //how to iterate over a stack
    // Iterator it = s1.iterator();
    // while(it.hasNext()){
    //   Object s2 = it.next();
    //   System.out.print(s2);

    // }

    

  }
}
