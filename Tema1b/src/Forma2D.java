
public  class Forma2D {
	private int width;
	private int length;

	public Forma2D()
	{
		this(0,0);
		 
	}
	
	
	public Forma2D(int width,int length )
	{
		this.width=width;
		this.length=length;
		System.out.printf("%s",this.toString());
	}
	
	public String toString()
	{
	return String.format("Marimea planului x=%d y=%d",width,length);
	}
	
		
	

}
