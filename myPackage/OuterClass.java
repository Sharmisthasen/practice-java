package myPackage;
// multiple extends can be fulfilled through inner class 
public class OuterClass extends ArrayTest{
	
	class InnerClass extends A{
		
		String fname = "Sharmistha" , lname = "Sen";
		int age = 30;
		InnerClass(){
			System.out.println("Inner class Constructor");
		}
		void printNameAge(){
			ProtetedMethod();
			System.out.println("First Name : "+fname+" Last Name : "+lname+" Age : "+age);
		}
		
		void outerMethod(){
			System.out.println("In Outerclass ,inside outerMethod");
			printI();
			int i =20;
			
			class LocalClass extends B{
				LocalClass(){
					System.out.println("I am a local class");
				}
				
			}
			LocalClass lc = new LocalClass();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------------------------------");
		OuterClass oc = new OuterClass();
		
		InnerClass obj = oc.new InnerClass();
		System.out.println("----------------------------------------");
		
		obj.printNameAge();
		obj.outerMethod();
		

	}

}
