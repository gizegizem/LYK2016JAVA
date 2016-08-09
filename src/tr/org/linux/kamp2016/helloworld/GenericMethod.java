package tr.org.linux.kamp2016.helloworld;

public class GenericMethod {

	public static <E> void printArray(E[] inputArray){
		for(E i : inputArray){  //her i elemanı için inputt array içinden yi bastır
			System.out.println(i);
		}
	}


}
