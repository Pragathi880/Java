package com.xworkz.september.driver;
import com.xworkz.september.things.Online;
import com.xworkz.september.things.RD;
import com.xworkz.september.things.FD;
import com.xworkz.september.things.Payment;
import com.xworkz.september.things.Account;
import com.xworkz.september.things.Bank;
public class BankRunner {
	public static void main(String[] args) {
		Online online = new Online();
		online.setOnlineAppName("Canera - candy");
		online.setAvailableInPlayStore(true);
		online.setRating(8.9f);
	
		RD rd = new RD();
		rd.setPeriod("1month");
		rd.setDate("29/10/2023");
		rd.setId("IDR26352627");
		
		FD fd = new FD();
		fd.setNameOfPerson("Pragathi R");
		fd.setId("IDRF6256151671");
		fd.setAmount("4 lakh");
		
		Payment payment = new Payment();
		payment.setTypeOfPayment("Cash");
		payment.setOnlinePayment(false);
		payment.setAmount(543);
		payment.setOnline(online);
		
		Account account = new Account();
		account.setAccountHolderName("Pragathi R");
		account.setAccountNumber("IDHSR32452552");
		account.setAccountType("Savings");
		account.setFd(fd);
		account.setRd(rd);
		
		Bank bank = new Bank();
		bank.setBankName("Canera");
		bank.setBranchName("Hassan");
		bank.setLocation("HASSAN");
		bank.setAccount(account);
		bank.setPayment(payment);
		System.out.println(bank.getBankName());
		System.out.println(bank.getBranchName());
		System.out.println(bank.getLocation());
		System.out.println(bank.getAccount());
		System.out.println(bank.getPayment());
	    System.out.println(account.getAccountHolderName());
	    System.out.println(account.getAccountNumber());
	    System.out.println(account.getAccountType());
	    System.out.println(account.getFd().getAmount());
	    System.out.println(account.getFd().getId());
	    System.out.println(account.getFd().getNameOfPerson());
	    System.out.println(account.getRd().getDate());
	    System.out.println(account.getRd().getId());
	    System.out.println(account.getRd().getPeriod());
		System.out.println(payment.getAmount());
		System.out.println(payment.getTypeOfPayment());
		System.out.println(payment.getOnline());
		System.out.println(online.getOnlineAppName());
		System.out.println(online.getRating());	
	}

}
