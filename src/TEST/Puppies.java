package TEST;

public class Puppies {
	
	Animals a;
	

	public Puppies(Animals a) {
			
		this.a=a;
	}
	public void Pass() {
		System.out.println("inside the Puppies");
		a.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animals a= new Dog();
		
		Puppies p = new Puppies(a);
		p.Pass();
	}

}
