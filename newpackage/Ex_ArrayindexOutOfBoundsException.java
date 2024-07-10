package newpackage;

public class Ex_ArrayindexOutOfBoundsException {

	public static void main(String[] args) {
		float [] medicineprice = new float[4];
		medicineprice[0] = 23.55f;
		medicineprice[1] = 120.5f;
		medicineprice[2] = 20.57f;
		medicineprice[3] = 100.05f;
		medicineprice[4] = 40.15f; //array size of 4 but values given of 5
		for(int i =0;i<3;i++)
		{
		System.out.println(medicineprice[i]);
		}
	}

}
