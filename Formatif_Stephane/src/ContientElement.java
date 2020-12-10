/*
* Author : stephanerheaume
*Date : 10-Dec-2020
*Code permettant de tester si un tableau contient un élément donné
*/
public class ContientElement
	{
		public static void main(String[] args)
		{
				int[] Tab = {11, 22, 13, 84, 95};
				int pourtrouver = 22;
				boolean trouver = false;
				
				for (int n : Tab)
			{
				if (n == pourtrouver) {
					trouver = true;
					
				}

			}
				if(trouver)
					System.out.println(pourtrouver + " est présent");
				else
					System.out.println(pourtrouver + " n'est pas présent");
		
	}
		
				
		}
