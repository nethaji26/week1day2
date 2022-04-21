package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(" The sum is "+  cal.addition(1,2,3));
		int c = cal.sub(5,4);
		System.out.println(" The sub is " + c);
		System.out.println(" The mul is " + cal.mul(5.0,4.0));
		float f = cal.div(20.0F, 10.0F);
		System.out.println(" the division is " + f);
	}
		
		public int addition(int num1 , int num2 , int num3)
		{
			int sum = num1+num2+num3;
			return sum;
		}
		
		public int sub(int num1, int num2)
		{
			return num1-num2;
		}
		
		public double mul(double num1, double num2)
		{
			return num1*num2;
		}
		public float div(float num1, float num2)
		{
			return num1/num2;
		}

	}


		
	


