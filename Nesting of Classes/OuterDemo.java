class Outer {
	
int a = 90;

class Inner {
	int b = 67;
 	void show() {			
		System.out.println("Value of a: " +a);		
		System.out.println("Value of b: " +b);
	}	
}

void show() {
	Inner in = new Inner();
	in.show();		
}

		
}


class OuterDemo {

public static void main(String[] arg) {
Outer out = new Outer();
Outer.Inner in = out.new Inner();
in.show();


}


}
