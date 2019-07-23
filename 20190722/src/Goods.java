import java.util.Scanner;

public class Goods {
	private String name;
	private int price;
	private int number;
	private int sold;

	Goods(String name, int price, int number, int sold) {
		this.name = name;
		this.price = price;
		this.number = number;
		this.sold = sold;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getNumber() {
		return number;
	}

	int getSold() {
		return sold;
	}

	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<goodsArray.length; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			int number = sc.nextInt();
			int sold = sc.nextInt();
			goodsArray[i] = new Goods(name, price, number, sold);
		}
		
		for(int i = 0; i<goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumber()+" ");
			System.out.print(goodsArray[i].getSold()+" ");
		}

	}

}
