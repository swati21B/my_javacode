package hybridlevelinheritance;

public class child1 extends parent1{ //child 1 has relation with parent 1 which is single level ex
	//child1 child 2 both can access common super class parent 1 that's ex of hierarchial level inheritance
	static void A1()
	{
		System.out.println("A1");
	}

	public static void main(String[] args) {
		A1();
		C1();

	}

}
