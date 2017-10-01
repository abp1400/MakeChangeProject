# Make Change Project

First week project for Skill Distillery by Alex Perez

Demonstrates:
*Basic java language skills.
Using eclopse for development project.

This project reads a price, an amount tendered, and prints the change due in each denomination.  
 
 User will begin by entering a price for the item he/she wants to purchase.
 The user will then be prompted for the amount he/she is paying with.
 If the user provides an insufficient amount, they will be prompted to 
 enter a correct amount (greater than the price of the item).  If the user provides an amount equal to the price of the item, the register will tell them that no change is necessary, but will give them the opportunity to provide a greater amount to get some change back.
 
 The program then takes the amounts provided and stores them as double variables, then takes the difference (price - amount tendered), and stores it as a change variable.
 
 I then take the change and multiply it by 100 and come up with a "change in cents" variable. I also used a Math.round() method because I researched that when we eventually cast it to an (int), there is some loss of numbers. The Math.round method will correct this loss.
 
 I then create int variables for the denominations, $20,$10,$5,$1, quarter, dime, nickel, and penny.  I derive their values by dividing the "change in cents" divided by the denomination in cents (e.g. $20 is 2000 cents). Casting "change in cents" to an int is required during these steps because each denomination variable is an int.
 
 After deriving the int, i use the mod operator % to reduce the "change in cents" before I pass it to the next least denomination (i.e. twenty dollar bill to ten dollar bill, then ten dollar bill to five dollar bill, and so on...). The division and then mod process is repeated until I get to pennies.
 
 I then take these variables and print them to output.  I initially displayed all values for all denominations, but then reviewed the prompt, which said to "hide" zero values for denominations. I also made sure to display singular and plural values for each denomination correctly. That is, if there was one penny, it said "penny" and if there were two or more, it said "pennies." I accomplished this, using an if/else if statement for each denomination.
 
 Finally, I gave the user the option of re-running the whole program, which I accomplished by using a do-while loop, where the program would run again if the user selected y or Y for the prompt "would you like to run the register again?"
   
 
 
 
