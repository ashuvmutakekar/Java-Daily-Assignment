package acts;

import doc.MyList;
import ecept.ListFullException;

public class Fixed_list implements MyList{
	int i;
	final int size;
	int arr[];
   public Fixed_list() {
	   i=0;
	   size=5;
	   this.arr=new int[size];
   }
@Override
public void insert(int element) {
	try {
		 if(i==size)
		 {
			throw new ListFullException("List is Full") ;
		 }
		 arr[i]=element;
		i++;
	}catch(ListFullException e)
	{
      System.out.println(e.getMessage());
	}
	
}
@Override
public void retrive(int i) {
	
		System.out.println(arr[i]);
	
	
}
}
