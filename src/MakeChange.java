import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class MakeChange {
	public static char playAgain;
	public static void main (String [] args){
	do {			Scanner kb = new Scanner(System.in); 
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
						System.out.println("How much money do you have now? Please enter new amount of money you are paying with: ");
						mymoney = kb.nextDouble();	
						
				} 
					
					
					change = (mymoney - price);					
					changeincents = Math.round(100*change);
					
					int changetwentybucks = (int)changeincents/2000;
					changeincents = changeincents % 2000;
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
					
					System.out.println("You gave me " + usd.format(mymoney));
					System.out.println("for an item that cost " + usd.format(price));
					System.out.println("Your change will be " + usd.format(change) + " which will consist of ");
					System.out.println(changetwentybucks + " twenty dollar notes");
					System.out.println(changetenbucks + " ten dollar notes");
					System.out.println(changefivebucks + " five dollar notes");
					System.out.println(changeonebucks + " one dollar notes");
					System.out.println(changequarter + " quarters");
					System.out.println(changedime + " dimes");
					System.out.println(changenick + " nickels");
					System.out.println(changepennies + " pennies");
					System.out.print("Would you like to run the register again? (y/n): ");
					playAgain = kb.next().charAt(0);
					
			} while (playAgain == 'Y' || playAgain == 'y');
	}
	
}