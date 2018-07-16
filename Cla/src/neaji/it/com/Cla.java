package neaji.it.com;



public class Cla {
	public int add(int a,int b) {
		int i=a+b;
		return i;
	}
	public int  sub(int a,int b) {
		int x=a-b;
		return x;
	}
	public static void main(String[] args) {
		Cla cl=new Cla();
		cl.add(20,30);
		cl.add(49,36);
		System.out.println(cl.add(10,30));
		System.out.println(cl.add(50,65));
	}

}
