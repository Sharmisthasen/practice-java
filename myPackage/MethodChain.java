package myPackage;

public class MethodChain {
	
	int i =2, j=3;
	private void reset(){
		i =2;
		j=3;
	}
	
	public MethodChain method1(){
		reset();
		i=i+i+j;
		System.out.println("Final value of i = "+i);
		return this;
	}
	public MethodChain method2(){
		reset();
		j=i+j+j;
		System.out.println("Final value of j = "+j);
		return this;
	}

	public void multiply(){
		j = i*j;
		System.out.println("J = "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChain m= new MethodChain();
		m.method1().multiply();
		m.method2().multiply();
	}

}
