package Chap02;

public class EchoTestDrive {
	
	public static void main(String args[]) {
	Echo e = new Echo();
	Echo e2 =new Echo();
	int x = 0;
	while(x<4) {
		//e.hello();
		e.count = e.count+1;
		if(x==3) {
			e2.count = e2.count + 1;
			System.out.println("(x==3)x = "+x+" e2 = "+e2.count);
		}
		if(x>0) {
			e2.count = e2.count + e.count;
			System.out.println("x = "+x+" e = "+e.count);
			System.out.println("(x>0)x = "+x+" e2 = "+e2.count);
		}
		x = x+1;
	}
	System.out.println(e2.count);
}
}
class Echo{
	int count = 0;
	void hello() {
		System.out.println("helloooooo");
	}
	
}
