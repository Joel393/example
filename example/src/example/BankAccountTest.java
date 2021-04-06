package example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BankAccount SBI = new BankAccount("Joel", "9075181945", 10000);
		float bal = SBI.balance = 10000;

		SBI.getBalance();
		assertTrue(bal>0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBankAccount() {
	
	}

	@Test
	public void testDeposit() {
		BankAccount SBI = new BankAccount("Joel", "9075181945", 10000);
		int res = SBI.Deposit(5000);
		System.out.println("\n");
		System.out.println("-------------------------------");
		System.out.println("After Depositing:");
		SBI.getBalance();
		int r1=(int)SBI.getb();
		assertEquals(r1, 15000);
	}

	@Test
	public void testWithdraw() {
		BankAccount SBI = new BankAccount("Joel", "9075181945", 10000);
		int res = SBI.Withdraw(5000);
		System.out.println("-------------------------------");
		System.out.println("After Withdrawing:");
		SBI.getBalance();
		assertEquals(res, 5000);
	}

	@Test
	public void testGetBalance() {
		BankAccount SBI = new BankAccount("Joel", "9075181945", 10000);
		System.out.println("\n-------------------------------");
		System.out.println("Get Balance Test:");
		SBI.getBalance();
	}

}
