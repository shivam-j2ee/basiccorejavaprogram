package collection;

import java.util.Comparator;

public class ComparatorOrderByFName implements Comparator<ComparatorEmployee>
{

	@Override
	public int compare(ComparatorEmployee o1, ComparatorEmployee o2)
	{
	    if(o1.getfName().equals(o2.getfName()))
	    {
	    	return o1.getlName().compareTo(o2.getlName());
	    }else
	    {
	    	return o1.getfName().compareTo(o2.getfName());
	    }
	}

}
