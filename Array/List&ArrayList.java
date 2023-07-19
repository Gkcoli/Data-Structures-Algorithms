import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
    List<String> names = new ArrayList<>();
    names.add("Bi-han");
    names.add("Kuai Liang");
    names.add("SubZero");
    System.out.println(names.size());
    System.out.println(names.contains("Bi-han"));
    System.out.println(names.contains("Kuai Liang"));
    System.out.println(names.contains("Scorpion"));
    System.out.println(names);

    for (String name : names){
      System.out.println(name);
    }
    names.forEach(System.out::println);
    
 

  }
}
