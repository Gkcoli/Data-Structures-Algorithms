import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
      String[] colors = new String[5];
      colors[0] = "hey";
      colors[1] = "there";
      colors[2] = "bitch";
      
      System.out.println(Arrays.toString(colors));

      System.out.println(colors[0]);
      System.out.println(colors[1]);
      System.out.println(colors[2]);

      int[] numbers = {100, 200};

      for (int i = 0; i <colors.length; i++){
      System.out.println(colors[i]);
      }
      for (int i = colors.length - 1; i >= 0; i--){
      System.out.println(colors[i]);    
    }
    for (String color : colors){
      System.out.println(color);
    }
    Arrays.stream(colors).forEach(System.out::println);
  }
}
