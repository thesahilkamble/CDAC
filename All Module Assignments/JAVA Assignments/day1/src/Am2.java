import java.util.Scanner;
class Am2{
public static void main(String[] value)
{
Scanner sc=new Scanner(System.in);
int Bill=0;
int qty=0;
boolean exit=false;
while(!exit) {
System.out.println("******* MENU CARD ********");
System.out.println(" WELCOME TO CDAC BIRYANI HOUSE ");
System.out.println("1.CHICKEN BIRYANI---- ₹.450.00");
System.out.println("2.MUTTON BIRYANI----₹.350.00"); 
System.out.println("3.VEG BIRYANI----₹250.00");
System.out.println("4. PANEER BIRYANI----₹300.00");
System.out.println("5. HYDERBADI DUM BIRYANI----₹400.00"); 
System.out.println("6.EGG BIRYANI-----₹.200.00");
System.out.println("7.SHAHI BIRYANI----₹.500.00");
System.out.println("8. KASMIRI BIRYANI----₹.450.00");
System.out.println("9.MUGHLIYA BIRYANI----₹.450.00"); System.out.println("10.VEG DUM BIRYANI----₹.300.00");
System.out.println("11.Waiter please bring the bill");

int choice=0;
System.out.println("Select your menu choice: ");
choice = sc.nextInt();

if(choice !=11)
{
System.out.println("how many?");
qty = sc.nextInt();
}

switch(choice){

case 1 : 
Bill+=450*qty;

break;

case 2 :

    
       Bill+=350*qty;
     
break;

case 3 :    
       Bill+=250*qty;
    
break;

case 4 :

       
     Bill+=300*qty;
 
break;

case 5 :

       Bill+=400*qty;

break;

case 6 :

    
       Bill+=200*qty;
     
break;
case 7 :

       Bill+=500*qty;
    
break;
case 8 :


        Bill+=450*qty;
    
break;
case 9 :


        Bill+=450*qty;
    
break;
case 10 :


       Bill+=300*qty;
      
break;

case 11 :
System.out.println("Total Bill: Rs."+ Bill);
exit=true;
break;

 default : 
 System.out.println("Invalid Option !!!!, Terminating the app!!!!!");
 exit=true;
break;
}
}
sc.close();
}
}
















