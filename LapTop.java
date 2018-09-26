package mylaptops;

public class LapTop 
{
	int id;
	int warrentyPeriod;
	double ratings;
	double width;
	double height;
	double price;
	String company;
	String model;
	
	//LapTop[] a;
	
	public LapTop(int id, int warrentyPeriod, double ratings, double width, double height, double price, String company,
				  String model) 
	{
		super();
		this.id = id;
		this.warrentyPeriod = warrentyPeriod;
		this.ratings = ratings;
		this.width = width;
		this.height = height;
		this.price = price;
		this.company = company;
		this.model = model;
	}

	public LapTop() 
	{
		// TODO Auto-generated constructor stub
	}

	
	public boolean display()
	{
		System.out.println("LapTop_id : "+id);
		System.out.println("LapTop_Warrenty : "+warrentyPeriod);
		System.out.println("LapTop_Rating : "+ratings);
		System.out.println("LapTop_width : "+width);
		System.out.println("LapTop_Height : "+height);
		System.out.println("LapTop_Price : "+price);
		System.out.println("LapTop_Company : "+company);
		System.out.println("LapTop_Model : "+model);
		System.out.println();
		System.out.println();
		return true;
	}
	
}
