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
					
					change = (mymoney - price);
					changeincents =(change*100);
					
					int changetenbucks = (int)changeincents/1000;
					changeincents = changeincents % 1000;
					int changefivebucks = (int)changeincents/500;
					changeincents = changeincents % 500;
					int changeonebucks = (int)changeincents/100;
					changeincents = changeincents % 100;
					int changequarter = (int)changeincents/25;
					changeincents = changeincents % 25;
					int changedime = (int)changeincents/10;
					changeincents = changeincents % 10;
					int changenick = (int)changeincents/5;
					changeincents = changeincents % 5;
					int changepennies = (int)changeincents;
		}
	}