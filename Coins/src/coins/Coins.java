package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coins {
	private HashMap<Integer, String> coin = new HashMap<Integer,String>();
	
	public Coins() {
		coin.put(1 , "penny");
		coin.put(10, "dime");
		coin.put(25, "quarter");
//		coin.put(50, "ÎåÃ«");
		coin.put(50, "half-dolar");
//		coin.put(50, "Îå¿é");
//		System.out.println("ALL:"+coin.keySet().size());
//		System.out.println(coin);
		for(Integer K : coin.keySet()) {		//±éÀúHashMap
			String S = coin.get(K);
			System.out.println(S);
		}
	}
	
	public String GetName(int amount) {
		if(coin.containsKey(amount))
			return coin.get(amount);
		else
			return "NOT FOUND!";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coins coin = new Coins();
		String name = coin.GetName(amount);
		System.out.println(name);

	}

}
