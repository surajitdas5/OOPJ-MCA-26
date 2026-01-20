class Area{
	
	void calculateArea(int side){
		System.out.println("Area of square is "+(side*side));
	}
	void calculateArea(int side1, int side2){
		System.out.println("Area of rect is "+(side1*side2));
	}
	void calculateArea(double radious){
		System.out.println("Area of circle is "+(Math.PI * Math.pow(radious, 2)));
	}
	
	public static void main(String[] args){
		Area a = new Area();
		a.calculateArea(10);
		a.calculateArea(3, 4);
		a.calculateArea(2.3);
	}
}