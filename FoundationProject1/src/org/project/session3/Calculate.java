package org.project.session3;

public class Calculate {
	public int perimeter(int a, int b) {
		int z, p;
		z=a+b;
		p=2*z;
		System.out.println("The perimeter is "+p);
		return p;
		
		
	}
	public double simpleInterest(double p, double r, double t) {
		double SI;
		SI= (p*r*t)/100;
		System.out.println("The SI is "+SI);
		return SI;
	}
	public double compoundInterest(double principle, double rate, double time) {
		double CI;
		CI= principle*(Math.pow((1+rate/100),time))-principle;
		System.out.println("The CI is "+CI);
		return CI;
		
	}

}
