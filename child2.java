package hybridlevelinheritance;

public class child2 extends parent1{ //child 2 has relation with parent 1 and parent 1 has again relation with parent 2 that's multy level ex
	//child1 child 2 both can access common super class parent 1 that's ex of hierarchial level inheritance
	static void G1()
	{
		System.out.println("G1");
	}

	public static void main(String[] args) {
		G1();
		C1();
		D1();

	}

}
