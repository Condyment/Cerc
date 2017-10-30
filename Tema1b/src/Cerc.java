
public class Cerc extends Forma2D{

	
	private double raza;
    private int x1;
	private int y1;
	private int x2;
	private int y2;
	;
	
public Cerc( int w,int l,int x1,int y1,int x2,int y2)
{
super(w,l);
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
System.out.printf("\n%s",this.toString(true));

}

public double distanta()
{
	int  d=((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
 raza=Math.sqrt(d);
  return raza;
}
public double lungimeacercului()
{
	return distanta()*2*Math.PI;
}
public double suprafatacercului()
{
	double something;

something=Math.pow(distanta(),2);
return Math.PI*something;
}

public String toString(boolean x)
{
	return String.format("Cordinatele punctelor \nx1=%d \ny1=%d \nx2=%d \ny2=%d\nRaza=%f \nLungimea Cercului=%f \nSuprafata Cercului=%f",x1,y1,x2,y2,distanta(),lungimeacercului(), suprafatacercului());
}

}
