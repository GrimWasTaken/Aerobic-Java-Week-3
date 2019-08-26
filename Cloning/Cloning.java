
class BigPileOfMoney implements Cloneable 
{
	int amount;
	String type;
	
	public BigPileOfMoney(int newAmount, String newType)
	{
		amount = newAmount;
		type = newType;
	}
	
	public Object clone() throws CloneNotSupportedException 
	{ 
	return super.clone(); 
	} 
}

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		BigPileOfMoney cash = new BigPileOfMoney(500000, "Yen");
		BigPileOfMoney moreCash = (BigPileOfMoney)cash.clone();
		
		moreCash.amount = 5000;
		moreCash.type = "USD";
		
		System.out.println("Here's some money");
		System.out.println(cash.amount);
		System.out.println(cash.type + "\n");
		
		System.out.println("Here's more money");
		System.out.println(moreCash.amount);
		System.out.println(moreCash.type);
	}
	
	
}
