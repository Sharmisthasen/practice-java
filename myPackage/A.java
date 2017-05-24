package myPackage;

class A{
public A(){
	System.out.print("hello i am Class A\n");
}

protected void ProtetedMethod(){
	String s = null;
	s="I am inside class A , method name ProtectedMethod";
	System.out.println(s);
}
public static void main(String args[]){
	System.out.println("hello world");
}
}
