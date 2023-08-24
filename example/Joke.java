
public class Joke {
	
	public static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joke n= new Joke();
		n.age=901;
		Joke.age=00;;
		
		System.out.println(n.age);
		
		
	}

}
