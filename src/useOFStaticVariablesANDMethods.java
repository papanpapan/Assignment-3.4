
public class useOFStaticVariablesANDMethods {
	static int a=4,b=6,c=3;//static variable declared
	public static int add()
	{
		int add=a+b;
		return add;
	}


		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			useOFStaticVariablesANDMethods obj=new useOFStaticVariablesANDMethods();
			obj.add();
			System.out.println("A is:"+a+"\n"+"B is:"+b);//static variable output
			System.out.println("Add: "+obj.add()+c);//static variable used in methods
			

	
	
		

	}

}
