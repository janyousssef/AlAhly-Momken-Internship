import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsTraining {
	public static void main(String[] args) throws Throwable{
		Properties p = new Properties();
		p.setProperty("name", "jan");
		p.setProperty("email", "janyoussef19@gmail.com");
		p.setProperty("description", "this file is to test Properties class");
		p.store(new FileWriter("props.properties"), null);
		
		Set s=p.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+"  "+me.getValue());
		}
	}

}
