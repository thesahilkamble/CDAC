package Day6_8April_StackImp.sahil;


public class Customer {

	public int id;
	public String name;
	public String address;
	
	
	Customer( String name,  int id ,String address){
		
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public String toString() {
	
		return ("ID: "+ id +" Name: "+ name + "Address: "+ address );
		
	}
}

