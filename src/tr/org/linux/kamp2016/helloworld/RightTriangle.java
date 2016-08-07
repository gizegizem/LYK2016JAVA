package tr.org.linux.kamp2016.helloworld;

public class RightTriangle {
	
private int a =1;
private int b=1;

public RightTriangle(int a,int b){
	this.a = a;
	this.b = b;
}

public int getA() {
	
	return a;
}

public void setA(int a) {
	if(a>0)
		this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	if(b>0)
		this.b = b;
}
public int hypotenuse(){
	int hypo= (int) (Math.hypot(a,b));
	//int c = (int)Math.sqrt((int)(a*a) + (int) (b*b));
	return hypo;
	//return c;
}

public int perimeter(){
	int hypo=(int) (Math.hypot(a, b));
	int result=a + b + hypo;
	return result;
}

@Override
public String toString() {
	return "A=" + this.getA() + " B=" + this.getB() + " Hipotenüs:" + this.hypotenuse()
			+ " Çevre: " + this.perimeter()
			+ " Alan: "+ this.area();
}

public int area(){
	int result= (a * b) / 2;
	return result;
}

}
