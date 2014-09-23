package chapter2;

public class Main {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-9-11 ÏÂÎç4:49:50
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setBalance(1000);
		Company company = new Company(account);
		Thread companyThread = new Thread(company);
		Bank bank = new Bank(account);
		Thread bankThread = new Thread(bank);
		System.out.printf("Account:Initial balance:%f\n", account.getBalance());
		companyThread.start();
		bankThread.start();
		try {
			companyThread.join();
			bankThread.join();
			System.out.printf("Account:Initial balance:%f\n", account.getBalance());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
