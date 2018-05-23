package Questao02teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class excuta {

	public static void main(String[] args) {
		
		List<Laptop> laptops = new ArrayList<>();
		Laptop lp1 = new Laptop("Dell",16 , 800);
		Laptop lp2 = new Laptop("LG",8 , 400);
		Laptop lp3 = new Laptop("Apple",8 , 1200);
		laptops.add(lp1);
		laptops.add(lp2);
		laptops.add(lp3);
		
		Collections.sort(laptops);
		
		for (Laptop laps : laptops) {
			System.out.println(laps);
		}
		
		Comparator<Laptop> com = new Comparator<Laptop>() {

	
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getRam() > l2.getRam()) {
					return 1;
				}else if (l1.getRam() < l2.getRam()) {
					return -1;
				}
				return 0;
			}
		};
		
		Collections.sort(laptops);
		for (Laptop laps : laptops) {
			System.out.println(laps);
		}
	}

}
