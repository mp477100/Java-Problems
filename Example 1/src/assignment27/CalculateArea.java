package assignment27;

public class CalculateArea {

	    void calculateArea(float x)
	    {
	        System.out.println("Area of the square: "+x*x+" sq units");
	    }
	    void calculateArea(float x, float y)
	    {
	        System.out.println("Area of the rectangle: "+x*y+" sq units");
	    }
	    void calculateArea(double x, double y)
	    {
	    	double area = (x*y)/2;
	    	System.out.println("Area of the Traingle: "+area+" sq units");
	    }
	    void calculateArea(double r)
	    {
	        double area = 3.14*r*r;
	        System.out.println("Area of the circle: "+area+" sq units");
	    }
	    public static void main(String args[]){
	    	CalculateArea obj = new CalculateArea();

}
}

