package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("How much is the item: ");
		double cost = kb.nextDouble();

		System.out.println("How much you paying: ");
		double money = kb.nextDouble();

		if (money < cost) {
			System.out.println("If you ain't got no money take your broke a** home.");
		} else if (money == cost) {
			System.out.println("Thanks for making my job easier, have a nice day.");
		} else if (money > cost) {
			double total = (money - cost);
			double newTotal = Math.round(total * 100.0) / 100.0;
			System.out.println("You're change is: " + newTotal);

			change(newTotal);

			System.out.println("Thanks for making me having to do my job, now get out of here.");

			kb.close();
		}
	}

	public static void change(double x) {

		int balance = (int) (x * 100);

		int twenty = balance / 2000;
		balance = balance % 2000;

		if (twenty > 0) {
			System.out.println(twenty + " twenty dollar(s) ");
		}

		int ten = balance / 1000;
		balance = balance % 1000;

		if (ten > 0) {
			System.out.println(ten + " ten dollar(s) ");
		}

		int five = balance / 500;
		balance = balance % 500;

		if (five > 0) {
			System.out.println(five + " five dollar(s) ");
		}

		int one = balance / 100;
		balance = balance % 100;

		if (one > 0) {
			System.out.println(one + " one dollar(s) ");
		}

		int quarter = balance / 25;
		balance = balance % 25;

		if (quarter > 0) {
			System.out.println(quarter + " quarter(s) ");
		}

		int dime = balance / 10;
		balance = balance % 10;

		if (dime > 0) {
			System.out.println(dime + " dime(s) ");
		}

		int nickel = balance / 5;
		balance = balance % 5;

		if (nickel > 0) {
			System.out.println(nickel + " nickel(s) ");
		}

		int penny = balance / 1;
		balance = balance % 1;

		if (penny > 0) {
			System.out.println(penny + " penny(ies) ");
		}
	}
}
