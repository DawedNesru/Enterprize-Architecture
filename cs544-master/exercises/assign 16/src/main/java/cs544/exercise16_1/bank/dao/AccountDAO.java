package cs544.exercise16_1.bank.dao;

import java.util.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cs544.exercise16_1.bank.domain.Account;


public class AccountDAO implements IAccountDAO {
	private SessionFactory sf = HibernateUtil.getSessionFactory();
	public void saveAccount(Account account) {
		// System.out.println("AccountDAO: saving account with accountnr ="+account.getAccountnumber());
	//accountlist.add(account); // add the new
		sf.getCurrentSession().persist(account);
	}

	public void updateAccount(Account account) {
		// System.out.println("AccountDAO: update account with accountnr ="+account.getAccountnumber());
		Account accountexist = loadAccount(account.getAccountnumber());
		if (accountexist != null) {
			sf.getCurrentSession().saveOrUpdate(account);
		}

	}

	public Account loadAccount(long accountnumber) {
		return (Account) sf.getCurrentSession().get(Account.class, accountnumber);
	}

	public Collection<Account> getAccounts() {
		return sf.getCurrentSession().createQuery("from Account").list();
	}

}
