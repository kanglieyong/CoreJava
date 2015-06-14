class Wallet
{
    private float money;

    public void setMoney(float money)
    {
	this.money = money;
    }

    public boolean pullOutMoney(float amount)
    {
	if (money >= amount) {
	    money -= amount;
	    return true;
	}
	return false;
    }
}

public class Person
{
    public static void main(String[] args)
    {
	Wallet wallet = new Wallet();
	System.out.println()"Putting $500 in the wallet\n";
	wallet.setMoney(500);
    }
}
