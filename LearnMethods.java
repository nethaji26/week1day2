package week1.day2;

public class LearnMethods {
	public static void main(String [] args)
	{
		LearnMethods lm = new LearnMethods();
		lm.printCarName();
		System.out.println(lm.getCarNumber());
		String x =lm.getCarVariant();
		System.out.println("The car variant is " +x);
		int c = lm.getMultiple(5, 4);
		System.out.println(c);

	}

	public void printCarName() {
		System.out.println(" The car name is Maruthi");
	}

	private long getCarNumber() {
		long carnumber = 43212;
		return carnumber;
	}

	public String getCarVariant() {
		return "ZXI";
	}

	public int getMultiple(int a , int b)
	{
		return a*b;
	}
}


