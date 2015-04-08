package unsynch;

public class Bank
{
    private final double[] accounts;

    public Bank(int n, double initialBalance)
    {
	accounts = new double[n];
	for (int i = 0; i < accounts.length; i++) {
	    accounts[i] = initialBalance;
	}
    }

    public void transfer(int from, int to ,double amount)
    {
	if (accounts[from] < amount) return;
	System.out.print(Thread.currentThread());
	accounts[from] -= amount;
	System.out.printf(" %10.2f from %d to %d", amount, from, to);
	accounts[to] += amount;
	System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    }

    public double getTotalBalance()
    {
	double sum = 0;

	for (double a : accounts) {
	    sum += a;
	}

	return sum;
    }

    public int size()
    {
	return accounts.length;
    }

    public static void main(String[] args)
    {
	Bank kly = new Bank(8, 40000);
	kly.size();
	kly.getTotalBalance();
	kly.transfer(2, 6, 200.00);
	System.out.println("Byebye!");
    }
}
