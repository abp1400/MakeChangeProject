import java.text.NumberFormat;
import java.util.Scanner;
	public class MakeChange {
		public static void main (String [] args){
				Scanner kb = new Scanner(System.in); 
				NumberFormat usd = NumberFormat.getCurrencyInstance();
			
				double price;
				double mymoney;
				double changeincents;
				double change;
				
				
				
				System.out.println("Please enter the price of your item: ");
				price = kb.nextDouble();
				System.out.println("Please enter the amount of cash you are paying with: ");
				mymoney = kb.nextDouble();
				
				 
					while(mymoney < price){
						System.out.println("You don't have enough money! You trying to pull a fast one?! Try again pal!");
						System.out.println("How much money do you have now? Please enter new amount: ");
						mymoney = kb.nextDouble();	
						
				} 
		}
	}