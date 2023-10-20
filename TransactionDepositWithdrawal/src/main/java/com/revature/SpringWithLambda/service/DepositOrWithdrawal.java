package com.revature.SpringWithLambda.service;

import com.revature.SpringWithLambda.daos.LoanDAO;
import com.revature.SpringWithLambda.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositOrWithdrawal {

	private final UserDAO userDAO;
	
	@Autowired
	public Deposit(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void depositOrWithdrawal(User user, BigDecimal amount) {
		int account_balance = userDAO.findBalanceById(user.getId());
		user.setBalance(account_balance + amount);
		userDAO.save(user);
	}
	
	
}
