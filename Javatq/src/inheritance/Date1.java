package inheritance;

public class Date1 {
	
	
	int mm;
	int dd;
	int yyy;
	
	public Date1(int mm, int dd,int yyy)
	{
		this.mm=mm;
		this.dd=dd;
		this.yyy=yyy;
	}
	

	@Override
	public String toString() {
		return  mm+"/"+dd+"/"+yyy;
	}






	

}
