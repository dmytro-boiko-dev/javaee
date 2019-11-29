package devcolibri;

import incapsulation.ObjectCats;
import incapsulation.ObjectMan;

public class ObjectCatsMain {
	
	static ObjectCats cat;
	static ObjectMan man;
	
	public static void main(String[] args){
		
		cat = new ObjectCats(5, "Rude", "betch");
		man = new ObjectMan(29, "BYOB", "OBEY", cat);
		
		man.getCat().setName("Dude");

		System.out.println(man);
		System.out.println(cat);
		cat.say();
		man.getCat().say();
		
	}

}
