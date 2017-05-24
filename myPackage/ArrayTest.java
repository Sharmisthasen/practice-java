package myPackage;

import java.util.ArrayList;

public class ArrayTest {
	
	int i = 10;
	public void printI(){
		System.out.println("In class ArrayTest, inside method printI"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ae= new ArrayList<>();
		ae.add("abc");
		ae.add("bfg");
		ae.add("asd");
		System.out.println(ae);

	}

}
