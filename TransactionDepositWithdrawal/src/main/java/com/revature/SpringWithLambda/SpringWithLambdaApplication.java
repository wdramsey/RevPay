package com.revature.SpringWithLambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.revature.SpringWithLambda.daos.LoanDAO;
import com.revature.SpringWithLambda.daos.UserDAO;
import com.revature.SpringWithLambda.service.GetAllLoansService;
import com.revature.SpringWithLambda.service.DepositOrWithdrawal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.revature.SpringWithLambda.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringWithLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithLambdaApplication.class, args);
	}

	//Below, I'll be defining functions that we will package and deploy onto Lambdas

	//I'll be commenting functions out to get unique jar files
	//in the real world, these functions will typically be separate apps

//	@Bean //These functions are considered FUNCTIONAL BEANS - they're executed by lambda functions
//	//this is a FUNCTION type method. takes input, returns output. in this case, Strings.
//	public Function<String, String> uppercase(){
//
//		return userInput -> userInput.toUpperCase(); //return the inputted String in uppercase
//
//	}

	@Autowired
	LoanDAO loanDAO;
	
//	@Autowired
//	UserDAO userDAO;


	//get all items
	@Bean
	public Supplier<String> getAllLoan() {
		List<Loan> loans = loanDAO.findAll();
		return loans::toString;
	}

	//insert item
//	@Bean
//	public Consumer<String> insertItem(){
//
//		//since this is a Consumer type function, we won't return anything
//		//but we CAN see this inputted value printed in the logs for our Lambda
//
//		return value -> System.out.println(value);
//
//	}
//
//
//	//get item by id (path param example)
//	@Bean
//	public Function<APIGatewayProxyRequestEvent, String> getItemById() {
//		return input -> {
//			//Extract path parameters from the event
//			String itemId = input.getPathParameters().get("itemId");
//
//			//The rest of the function logic here
//			String response = "Received itemId: " + itemId;
//
//			return response;
//		};
//	}
	//deposit/withdraw from user balance
//	@Bean
//	public Consumer<BigDecimal> depositOrWithdrawal() {
//		return input -> {
			//take request body as input using API gateway
			//have to specify which input is which somehow
				//take in 2 inputs using a BiFunction
		}
		//bifunction implementation
//		import java.util.function.BiFunction;
//
//		public class MyBiFunction implements BiFunction<String, String, String> {
//		    @Override
//		    public String apply(String input1, String input2) {
//		        // Your custom logic here
//		        return "Result: " + input1 + " " + input2;
//		    }
//		}
		//configuration of bifunction as a bean needed
//		import org.springframework.context.annotation.Bean;
//		import org.springframework.context.annotation.Configuration;
//
//		@Configuration
//		public class MyFunctionConfiguration {
//		    @Bean
//		    public BiFunction<String, String, String> myBiFunction() {
//		        return new MyBiFunction();
//		    }
//		}
		

}
