package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompareArrayNumbers {

	/**
	 * Method that receives two lists and returns another list with de max of each
	 * index
	 *
	 * @param a - Some Integer Number
	 * @param b - Another Integer Number
	 * @return The result of a + b
	 */
	public static List<Integer> max(List<Integer> a, List<Integer> b) {

		// ACLARACIÓN: SE ASUME QUE AMBAS LISTAS SON DEL MISMO TAMAÑO
		
		List<Integer> c = new ArrayList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			Integer numA = a.get(i);
			Integer numB = b.get(i);

			if (numA > numB) {
				c.add(numA);
			} else {
				c.add(numB);
			}
		}
		
		return c;

	}

}
