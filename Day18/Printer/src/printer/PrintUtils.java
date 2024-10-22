package printer;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PrintUtils {


	public static void SaveBookList(Map<String,Printer> map, String name) throws IOException {
		File f=new File(name);
		if(!f.exists())
		{
			f.createNewFile();
		}
		List<Printer> list = new ArrayList<>(map.values());
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(name))){
			
			for (Printer printer : list) {
				oos.writeObject(printer);

			}

			System.out.println("Booklist saved successfully");
		}

	}

	

	public static Map<String,Printer> ReadBookList(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
		Map<String,Printer> map=new HashMap<>();
		 try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(name))) {
			for(;;)
			 {
              Printer p = (Printer) ois.readObject();
              map.put(p.getSerialNo(),p);
			 }
         }catch(EOFException e)
		 {
        	 System.out.println(e.getMessage());
		 }
		 return map;
     }
 

 
}

