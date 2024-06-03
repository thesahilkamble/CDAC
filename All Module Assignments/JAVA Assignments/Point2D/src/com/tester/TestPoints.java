package com.tester;
import com.developers.geometry.Point2D;
import java.util.Scanner;

class TestPoints{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

// creating array

System.out.println("How many points to plot? ");
Point2D[] pt= new Point2D[sc.nextInt()];

for(int i=0;i<pt.length;i++)
{
	System.out.println("Enter X and Y: ");
	
	// Creating instances
	
	pt[i]=new Point2D(sc.nextDouble(),sc.nextDouble());
	
	// Checking for repeated points

	 for (int j=0; j<=i-1; j++)
	 {
	if(pt[i].isEqual(pt[j]))
	{
		System.out.println("Entered points are repeating, please add different points! ");
		
		i--;
	}
	}
	 // scanner closed

}

//For each loop to display

System.out.println("Display all points");

for(Point2D p : pt)
{
	System.out.println(p.show());
}
sc.close();
}
}
	


// Old method

/* System.out.println("Enter the Coorindate: ");
double x = sc.nextDouble();
double y = sc.nextDouble();

Point2D p1 =new  Point2D(x,y);

System.out.println(p1.show());
System.out.println("Enter the Coorindate: ");

x = sc.nextDouble();
y = sc.nextDouble();

Point2D p2 =new  Point2D(x,y);

System.out.println(p2.show());

// Check for coordinates 

if(pt[0].isEqual(pt[1])) 
System.out.println("Co-ordinates are same");

else {
System.out.println("Co-ordinates are different");
double dis=pt[0].calculateDistance(pt[1]);
System.out.println("Distance: " + dis);
}

*/

