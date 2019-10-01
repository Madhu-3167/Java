import java.util.Scanner;
public class EvenNumber {
public static void main(String[] args) {
int limit=40;
System.out.println("Printing Even Numbers Between 1 to"+limit);
for(int i=1;i<=limit;i++)
{
if(i%2==0) {
System.out.print(i+" ");
}
}
}
}