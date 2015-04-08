package unsynch;

public class TransferRunnable implements Runnable
{
    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 10;

    public TransferRunnable(Bank b, int from, double max)
    {
	bank = b;
	fromAccount = from;
	maxAmount = max;
    }

    public void run()
    {
	try {
	    while (true) {
		int toAccount = (int) (bank.size() * Math.random());
		double amount = maxAmount * Math.random();
		bank.transfer(fromAccount, toAccount, amount);
		Thread.sleep((int) (DELAY * Math.random()));
	    }
	} catch (InterruptedException e) {
	}
    }

    public static void main(String[] args)
    {
	Bank abank = new Bank(10, 4000);
	TransferRunnable trans = new TransferRunnable(abank, 3, 2000);
	System.out.println("Done!");
    }
}
