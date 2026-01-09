

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class HistoList
{
	private ListNode front;

	public HistoList( )
	{
		front = null;
	}


	//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj)
	{
		int index = indexOf(obj);
		if (index != -1) {
			// If it exists, get the node and increment the ThingCount value
			ListNode existingNode = nodeAt(index);
			ThingCount tc = (ThingCount) existingNode.getValue();
			tc.setCount(tc.getCount() + 1);
		} else {
			// If it doesn't exist, add to front [cite: 19]
			ThingCount newTC = new ThingCount(obj, 1);
			front = new ListNode(newTC, front);
		}
	}

	//RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj)
	{
		int spot = 0;
		ListNode current = front;
		
		// Wrap the object in a ThingCount to use compareTo
		// This ensures strict type checking happens inside ThingCount.compareTo 
		ThingCount searchObj = new ThingCount(obj, 0);
		
		while (current != null) {
			ThingCount currentTC = (ThingCount) current.getValue();
			
			// Use compareTo to find the match (and trigger exception if types mismatch)
			if (currentTC.compareTo(searchObj) == 0) {
				return spot;
			}
			
			current = current.getNext();
			spot++;
		}
		return -1;
	}

	//RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot)
	{
		ListNode current = front;
		for (int i = 0; i < spot; i++) {
			if (current == null) return null; // Safety check
			current = current.getNext();
		}
		return current;
	}

	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String output = "";
		ListNode current = front;
		while (current != null) {
			output += current.getValue().toString() + " ";
			current = current.getNext();
		}
		return output;
	}
}