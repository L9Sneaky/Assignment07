
public class TestMyRectangle {

	public static void main (String[]args) {
		MyRectangle i = new MyRectangle();
		MyRectangle p = new MyRectangle();
		i.w = 4;
		i.h = 8;
		p.w = 3.5;
		p.h = 35.9;

		i.result();
		p.result();
		
		i.printRectangle();
		
	}
}
