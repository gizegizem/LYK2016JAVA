package tr.org.linux.kamp2016.helloworld;

public class MathLibrary {

	
	public static void main(String[] args) {
		
		int i=7;
		int j=-9;
		double x=72.3;
		double y=0.34;
		
		
		System.out.println("J'nin mutlak değeri: "+Math.abs(i));
		
		System.out.println("X'in yuvarlanmış değeri: "+Math.round(x));
		
		System.out.println("X ve Y den hangisi küçük: "+Math.min(x, y));
		
		System.out.println("İ ve J den hangisi büyük: "+Math.max(i, j));
		
		System.out.println("Pi:  "+Math.PI);
		
		System.out.println("e:  "+Math.E);
		
		double angle=45.0 *2.0*Math.PI /300.0;
		
		System.out.println("cos("+angle+")= " +Math.cos(angle));
		
		System.out.println("exp(1.0) is " +Math.exp(1.0));
		
		System.out.println("exp(1.0) is " +Math.exp(14.3));
		
		
		
		
		
		
	}

}
