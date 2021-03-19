import java.util.Scanner;

public class InputNoTwo {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
if(!findInputType(s)){
System.out.println("number is digit");
}
else{
System.out.println("not digit");
}
}

static boolean findInputType(String s){


// int data=Integer.parseInt(s);
//
// System.out.println(data);
boolean flag=true;
for(int i=0;i<s.length();i++){
if(!Character.isDigit(s.charAt(i))){
flag=false;
}
}
return flag;

}
}
