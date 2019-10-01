import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ListExample {
 public static void main(String[] args) {
   List<String> al = new ArrayList<String>();
   al.add("Chaitanya");
   al.add("Rahul");
   al.add("Ajeet");
   System.out.println("ArrayList Elements: ");
   System.out.print(al);

   List<String> a2 = new LinkedList<String>();
   a2.add("Kevin");
   a2.add("Peter");
   a2.add("Kate");
   System.out.println("LinkedList Elements: ");
   System.out.print(ll);
 }
}