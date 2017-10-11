
public class QuadrilateralTest {
	public static void main(String args[])
	{
		Quadrilateral tr=new Trapezoid();
		tr.setPoint1(new Point(-2,1));
		tr.setPoint2(new Point(2,1));
		tr.setPoint3(new Point(5,-3));
		tr.setPoint4(new Point(-5,-3));
		System.out.println("Area of Trapezium is:"+tr.area());
		
		Quadrilateral pa=new Parallelogram();
		pa.setPoint1(new Point(5,10));
		pa.setPoint2(new Point(10,30));
		pa.setPoint3(new Point(30,10));
		pa.setPoint4(new Point(35,30));
		if(pa.validatePoints())
		{
			System.out.println("Area of Parallelogram is:"+pa.area());
		}
		else
		{
			System.out.println("The specified points not forms Parallelogram");
		}
		Quadrilateral re=new Rectangle();
		re.setPoint1(new Point(10,-10));
		re.setPoint2(new Point(10,25));
		re.setPoint3(new Point(35,-10));
		re.setPoint4(new Point(35,25));
		if(re.validatePoints())
		{
			System.out.println("Area of Rectangle is:"+re.area());
		}
		else
		{
			System.out.println("The specified points not forms Rectangle");
		}
		Quadrilateral sq=new Square();
		sq.setPoint1(new Point(-2,-2));
		sq.setPoint2(new Point(-2,2));
		sq.setPoint3(new Point(2,-2));
		sq.setPoint4(new Point(2,2));
		if(sq.validatePoints())
		{
			System.out.println("Area of square is:"+sq.area());
		}
		else
		{
			System.out.println("The specified points not forms Square");
		}
	}
}

class Quadrilateral
{
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public Point getPoint4() {
		return point4;
	}
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	double area()
	{
		return 0;
	}
	boolean validatePoints()
	{
		return true;
	}
}
class Trapezoid extends Quadrilateral
{
	double area()
	{
		double height=0,base1=0,base2=0;
		if(getPoint1().getY()==getPoint2().getY())
		{
			if(getPoint3().getY()==getPoint4().getY())
			{
				height=getPoint3().getY()-getPoint1().getY();
				if(height<0)
				{
					height=-height;
				}
				base1=getPoint2().getX()-getPoint1().getX();
				if(base1<0)
				{
					base1=-base1;
				}
				base2=getPoint3().getX()-getPoint4().getX();
				if(base2<0)
				{
					base2=-base2;
				}
			}
		}
		if(getPoint1().getY()==getPoint3().getY())
		{
			if(getPoint2().getY()==getPoint4().getY())
			{
				height=getPoint2().getY()-getPoint1().getY();
				if(height<0)
				{
					height=-height;
				}
				base1=getPoint3().getX()-getPoint1().getX();
				if(base1<0)
				{
					base1=-base1;
				}
				base2=getPoint2().getX()-getPoint4().getX();
				if(base2<0)
				{
					base2=-base2;
				}
			}
		}
		if(getPoint1().getY()==getPoint4().getY())
		{
			if(getPoint3().getY()==getPoint2().getY())
			{
				height=getPoint3().getY()-getPoint1().getY();
				if(height<0)
				{
					height=-height;
				}
				base1=getPoint4().getX()-getPoint1().getX();
				if(base1<0)
				{
					base1=-base1;
				}
				base2=getPoint3().getX()-getPoint2().getX();
				if(base2<0)
				{
					base2=-base2;
				}
			}
		}
		if(height==0)
		{
			throw new IllegalArgumentException("The specified points not forms a trapezium");
		}
		double area=height*((base1+base2)/2);
		return area;
	}
}
class Parallelogram extends Trapezoid
{
	public boolean validatePoints()
	{
		double base1=0,base2=0;
		if(getPoint1().getY()==getPoint2().getY())
		{
			if(getPoint3().getY()==getPoint4().getY())
			{
				base1=getPoint2().getX()-getPoint1().getX();
				if(base1<0)
				{
					base1=-base1;
				}
				base2=getPoint3().getX()-getPoint4().getX();
				if(base2<0)
				{
					base2=-base2;
				}
			}
		}
		else if(getPoint1().getY()==getPoint3().getY())
		{
			if(getPoint2().getY()==getPoint4().getY())
			{
				base1=getPoint3().getX()-getPoint1().getX();
				if(base1<0)
				{
					base1=-base1;
				}
				base2=getPoint2().getX()-getPoint4().getX();
				if(base2<0)
				{
					base2=-base2;
				}
			}
		}
		else if(getPoint1().getY()==getPoint4().getY())
		{
			if(getPoint3().getY()==getPoint2().getY())
			{
				base1=getPoint4().getX()-getPoint1().getX();
				if(base1<0)
				{
					base1=-base1;
				}
				base2=getPoint3().getX()-getPoint2().getX();
				if(base2<0)
				{
					base2=-base2;
				}
			}
		}
		else
		{
			return false;
		}
		if(base1==base2)
		{
			return true;
		}
		return false;
	}
}
class Rectangle extends Parallelogram
{
	public boolean validatePoints()
	{
		if(getPoint1().getY()==getPoint2().getY())
		{
			if(getPoint3().getY()==getPoint4().getY())
			{
				if((getPoint1().getX()==getPoint3().getX() || getPoint1().getX()==getPoint4().getX() )
						&& (getPoint2().getX()==getPoint3().getX() || getPoint2().getX()==getPoint4().getX() ))
				{
					return true;
				}
			}
		}
		if(getPoint1().getY()==getPoint3().getY())
		{
			if(getPoint2().getY()==getPoint4().getY())
			{
				if((getPoint1().getX()==getPoint2().getX() || getPoint1().getX()==getPoint4().getX() )
						&& (getPoint2().getX()==getPoint3().getX() || getPoint3().getX()==getPoint4().getX() ))
				{
					return true;
				}
			}
		}
		if(getPoint1().getY()==getPoint4().getY())
		{
			if(getPoint3().getY()==getPoint2().getY())
			{
				if((getPoint1().getX()==getPoint3().getX() || getPoint1().getX()==getPoint2().getX() )
						&& (getPoint4().getX()==getPoint3().getX() || getPoint4().getX()==getPoint2().getX() ))
				{
					return true;
				}
			}
		}
		return false;
	}
}
class Square extends Rectangle
{
	public boolean validatePoints()
	{
		double height=0,base1=0;
		if(getPoint1().getY()==getPoint2().getY())
		{
			if(getPoint3().getY()==getPoint4().getY())
			{
				if((getPoint1().getX()==getPoint3().getX() || getPoint1().getX()==getPoint4().getX() )
						&& (getPoint2().getX()==getPoint3().getX() || getPoint2().getX()==getPoint4().getX() ))
				{
					height=getPoint3().getY()-getPoint1().getY();
					if(height<0)
					{
						height=-height;
					}
					base1=getPoint2().getX()-getPoint1().getX();
					if(base1<0)
					{
						base1=-base1;
					}
					if(height==base1)
					return true;
				}
			}
		}
		if(getPoint1().getY()==getPoint3().getY())
		{
			if(getPoint2().getY()==getPoint4().getY())
			{
				if((getPoint1().getX()==getPoint2().getX() || getPoint1().getX()==getPoint4().getX() )
						&& (getPoint2().getX()==getPoint3().getX() || getPoint3().getX()==getPoint4().getX() ))
				{
					height=getPoint2().getY()-getPoint1().getY();
					if(height<0)
					{
						height=-height;
					}
					base1=getPoint4().getX()-getPoint1().getX();
					if(base1<0)
					{
						base1=-base1;
					}
					if(height==base1)
					return true;
				}
			}
		}
		if(getPoint1().getY()==getPoint4().getY())
		{
			if(getPoint3().getY()==getPoint2().getY())
			{
				if((getPoint1().getX()==getPoint3().getX() || getPoint1().getX()==getPoint2().getX() )
						&& (getPoint4().getX()==getPoint3().getX() || getPoint4().getX()==getPoint2().getX() ))
				{
					height=getPoint3().getY()-getPoint1().getY();
					if(height<0)
					{
						height=-height;
					}
					base1=getPoint2().getX()-getPoint1().getX();
					if(base1<0)
					{
						base1=-base1;
					}
					if(height==base1)
					return true;
				}
			}
		}
		return false;
	}
	public String toString()
	{
		return super.toString();
	}
}
class Point
{
	private double x,y;
	public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public Point()
	{
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}