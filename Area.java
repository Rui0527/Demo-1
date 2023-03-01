class AreaVol
{
	int length,breadth,height;
	
	void Getdata(int l,int b,int h)
	{
		length = l;
		breadth = b;
		height =h;
	}
	
	void calarea()
	{
		System.out.println("The area is: "+(length*breadth));
	}

	void calvolume()
	{
		System.out.println("The volume is: "+(length*breadth*height));
	}
}

class Area
{
	public static void main(String args[])
	{
		AreaVol A1 = new AreaVol();
		A1.Getdata(5,5,5);
		A1.calarea();
		A1.calvolume();
	}
}	
		
