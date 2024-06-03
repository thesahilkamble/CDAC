import java.util.Scanner;

class Tester{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

//

System.out.println("Enter the Co-orindate: ");
double x = sc.nextDouble();
double y = sc.nextDouble();

Point2D p1 =new  Point2D(x,y);

System.out.println(p1.show());
System.out.println("Enter the Co-orindate: ");

x = sc.nextDouble();
y = sc.nextDouble();

Point2D p2 =new  Point2D(x,y);

System.out.println(p2.show());

if(p1.isEqual(p2)) 
System.out.println("Co-ordinates are same");

else {
System.out.println("Co-ordinates are different");
double dis=p1.calculateDistance(p2);
System.out.println("Distance: " + dis);
}
}
}