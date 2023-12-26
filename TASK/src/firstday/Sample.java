package firstday;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Sample {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("hasan");
		a.add("mysore");
		a.add("kolar");
		a.add("bidar");
		a.add("benglore");
		System.out.println(a);

		System.out.println(" \n  \n   ");
		
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("guntr");
		a2.add("vizag");
		a2.add("antpir");
		a2.add("dharwmavrm");
	//	a2.add("amareshwar");
		System.out.println(a2);

		System.out.println(" \n  \n   ");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("panji");
		a3.add("vacso");
	//	a3.add("beach");
		a3.add("beer");
	//	a3.add("rusian");
		System.out.println(a3);

		
		System.out.println(" \n \n  \n   ");
		
		LinkedHashMap<String, ArrayList<String>> l = new LinkedHashMap<String, ArrayList<String>>();
		l.put("karnataka", a);
		l.put("andra", a2);
		l.put("goa", a3);
		System.out.println(l);
		
		System.out.println(" \n  \n   ");
		
		for(Entry<String, ArrayList<String>> e : l.entrySet()) {
			System.out.println(e);
		}
		
		
		System.out.println(" \n  \n ");
		
		
		String value="beer";
		boolean flag=true;
		for(Entry<String, ArrayList<String>> e : l.entrySet()) {
			ArrayList<String> d=e.getValue();
			for(Object s: d) {
				if(s==value) {
					
					System.out.println(" \n  \n   ");
					System.out.println(e.getKey());
					flag=false;
					break;
				}
				
			}
		}
		System.out.println(" \n  \n   ");
		
		if(flag) {
			System.out.println("no state found");
		}
		
		
		int max=0;
		ArrayList<String> name= new ArrayList<String>();
		for(Entry<String, ArrayList<String>> e:l.entrySet()) {
			int size=e.getValue().size();
			if(max<size) {
				max=size;
				name.clear();
				name.add(e.getKey());
			} else if(max==size) {
				name.add(e.getKey());
			}
		}
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
