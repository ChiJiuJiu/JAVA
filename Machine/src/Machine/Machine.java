package Machine;

public class Machine {
	int price=50;
	int balance;
	int total;
	void showprice() {
		System.out.println(this.price);
	}
	
	Machine(){			//¹¹Ôìº¯Êý
		this.price = 0;
	}
	Machine(int price){
		this();
		showprice();
		this.price = price;
	}
	void SetPrice(int price) {
		this.price = price;
	}
	void ShowPromt() {
		System.out.println("Welcome!");
	}
	void InsertMoney(int amount) {
		balance += amount;
		showBalance();
	}
	void showBalance() {
//		System.out.println(balance);
		System.out.println(this.balance);
	}
	void GetFood() {
		if(balance>=price) {
			System.out.println("Here you are!");
			balance -= price;
			total += price;
			System.out.println(balance);
		}
	}
	public static void main(String[] args) {
		Machine vm = new Machine();
		vm.showprice();
		Machine vm1 = new Machine(1000);
		vm1.showprice();
//		vm.ShowPromt();
//		vm.showBalance();
//		vm.InsertMoney(100);
//		vm.GetFood();
	}

}
