

///(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		count = 0;
		thing = null;
	}
	
	public ThingCount(Object thang, int cnt)
	{
		thing = thang;
		count = cnt;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int cnt)
	{
		count = cnt;
	}

	public void setThing(Object obj)
	{
		thing = obj;
	}	
	
	public Object getThing()
	{
		return thing;
	}
	
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		// Cast provided by starter code implies obj will be ThingCount
		ThingCount other = (ThingCount)obj;
		
		if (this.thing == null) {
			return other.thing == null;
		}
		return this.thing.equals(other.thing);
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		
		// Required check based on Lab Output Exception trace 
		if (this.thing != null && other.thing != null) {
			if (!this.thing.getClass().equals(other.thing.getClass())) {
				throw new RuntimeException("both objects are not of the same type");
			}
			return ((Comparable)this.thing).compareTo(other.thing);
		}
		return -1;		
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}