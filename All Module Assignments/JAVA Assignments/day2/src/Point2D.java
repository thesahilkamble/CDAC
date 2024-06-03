import java.lang.Math;
class Point2D {

private double x;
private double y;

// Param Ctor
public Point2D(double x, double y){
this.x=x;
this.y=y;
}

// Get x y values 
public String show(){
return (x +", "+ y);
}

// Check if Co-ordinates are Eqaul

public boolean isEqual(Point2D p)
{
return this.x==p.x && this.y==p.y; // 
} 


//d=√((x2 – x1)² + (y2 – y1)²

public double calculateDistance(Point2D p){
 double res=Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y));
return  res;
}

}

