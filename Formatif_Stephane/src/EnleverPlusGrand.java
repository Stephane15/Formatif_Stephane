import java.util.Arrays;


/*
* Author : stephanerheaume
*Date : 10-Dec-2020
*Code qui qui retourne un même tableau amputé du plus grand nombre de cet élément.
*/
public class EnleverPlusGrand
	{

		public static void main(String[] args)
			{
				int Tab[]= {15, 2, 30, 5, 4, 14};
				int indx = MethodesTableaux.plusGrandIndex(Tab);
				
				int[] newTB1 = java.util.Arrays.copyOfRange(Tab, 0, indx);
				int[] newTB2 = java.util.Arrays.copyOfRange(Tab, indx+1, Tab.length);
				int[] finale = new int[Tab.length - 1];
				
				
				
				for(int i = 0; i<finale.length;i++) {
					if(i<newTB1.length) {
						finale[i] = newTB1[i];
					} else {
						finale[i] = newTB2[i-newTB1.length];
					}
				}
				
				
				
				System.out.println(Arrays.toString(finale));

			}
	}
		
	
