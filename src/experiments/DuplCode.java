package experiments;

public class DuplCode {

	private int yearlyInterestRate;

	private static final int weekNum = 52;
	private static final int yearNum = 12;

	private int calculateInterest(int amount, int num) {
		return amount * yearlyInterestRate / num;
	}

	public int calculateWeeklyInterest(int amount) {
		return calculateInterest(amount, weekNum);
	}

	public int calculateMonthlyInterest(int amount) {
		return calculateInterest(amount, yearNum);
	}
}
