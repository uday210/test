import java.util.Scanner;

public class met{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int i;
System.out.println("enter number u whant to find even or not");
i=in.nextInt();
System.out.println(evenorodd(i));
//System.out.println(i);
}
//methods
static int square(int i){
return i*i;
}
static boolean evenorodd(int j){
int i = j%2;
if(i==0) return true;
else return false;
}
}