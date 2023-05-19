package classpart;

import hiding.Account;

public class AccountTest {

	public static void main(String[] args) {
		// 계좌 생성
		Account account = new Account("1500-9408", "강정현", 1000000);
		
		
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());

	}

}
