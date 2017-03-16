
public class Cchain {

	public Cchain(){
		System.out.println("in default constructor");
	}
	public Cchain(int i){
		this();
		System.out.println("in single parameter constructor");
	}
	public Cchain(int i,int j){
		this();
		System.out.println("in double parameter constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cchain ch=new Cchain(10);
		Cchain ch1=new Cchain(10,20);

	}
	
	
		
}


