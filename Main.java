package mylaptops;

public class Main 
{
	public static void printLapTopInfo(LapTop[] a)
	{
		/*for (int i=0;i<a.length;i++);
		{
			System.out.println(a[1]);
		}*/
			
	}

	public static LapTop getTopLapTop(LapTop[] a)
	{
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[1]);
		}*/
		return null;
		
	}
	
	
	public static LapTop getLowRatingLapTop(LapTop[] a)
	{
		return null;
	
	}
	
	public static LapTop findLapTop(int id, LapTop[] a)
	{
		return null;
	
	}
	
	public static LapTop[] sortByIdLapTop(LapTop[] a)
	{
		return null;
		
	}
	
	public static LapTop[] sortByRating(LapTop[] a)
	{
		return null;
		
	}
	
	public static LapTop[] sortByPrice(LapTop[] a)
	{
		return null;
		
	}
	
	public static void printAllLapTops(LapTop[] a)
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[2].display());
		}
		
		System.out.println();
		
	}
	public static void main(String[] args) 
	{
		
		LapTop[] a = new LapTop[10];
		LapTop l = new LapTop(1, 1, 4.8, 13.3, 8.5, 61990.00, "APPLE", "MQD32HN/AA1466");
		a[0] = l;
		LapTop m = new LapTop(2, 1, 4.5, 15.6, 8.5, 26990.00, "HP", "15Q-bU037TU");
		a[1] = m;
		LapTop n = new LapTop(3, 1, 3.2, 10.1, 7.0, 12490.00, "ACER", "sw110-IeT");
		a[2] = n;
		LapTop o = new LapTop(4, 1, 4.6, 15.6, 8.5, 21990.00, "DELL", "D-3552");
		a[3] = o;
		LapTop p = new LapTop(5, 1, 4.7, 14.0, 14.0, 29990.00, "LENOVO", "330-14IKB");
		a[4] = p;
		LapTop q = new LapTop(6, 1, 3.9, 15.6, 8.5, 24990.00, "ASUS", "F541UA");
		a[5] = q;
		LapTop r = new LapTop(7, 1, 4.13, 13.5, 7.5, 140990.00, "MICROSOFT", "DAJ-00083");
		a[6] = r;
		LapTop s = new LapTop(8, 1, 3.8, 15.6, 8.5, 22490.00, "MICROMAX", "U351568w");
		a[7] = s;
		LapTop t = new LapTop(9, 2, 4.9, 17.3, 9.5, 205000.00, "MSI", "GTX980M");
		a[8] = t;
		LapTop u = new LapTop(10, 2, 5.0, 17.3, 9.5, 219994.00, "ALLIENWARE", "AC2-R43");
		a[9] = u;
		
		for (int i=0;i<10;i++)
		{
			a[i] = new LapTop();
		}
		printAllLapTops(a);
		/*printLapTopInfo(a);
		getTopLapTop(a);*/
		
	}
}
