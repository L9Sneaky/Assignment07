
public class MyRectangle {

	public double w, h, a, p;

	public void printRectangle() {
		if (w > 0 && h > 0) {
			for (int c = 1; c <= w; c++) {
				for (int c2 = 1; c2 <= h; c2++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}
	}

	public void result() {
		a = w * h;
		p = (2 * w) + (2 * h);
		System.out.println("The area of a rectangle with width " + w + " and height " + h + " is " + a
				+ " The perimeter of a rectangle is " + p);
	}

}
