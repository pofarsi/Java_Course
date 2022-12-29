## Class Definitions
This code defines several classes that represent a branch, a credit card, an account, and a customer. The Branch class has three attributes: code, city, and rank. The Account class has two attributes: accountNumber and creditCard, which is an object of the CreditCard class. The CreditCard class has two attributes: cardNumber and credit. The Customer class has two attributes: name and account, which is an object of the Account class.

## Setters and Getters
Each class has setter and getter methods for each of its attributes. For example, the Branch class has getCode() and setCode() methods for the code attribute.

## toString Method
Each class has an overridden toString() method that returns a string representation of the object. For example, calling toString() on a Customer object will return a string that contains the customer's name and account details.

## calCustomerBalance Method
The Account class has a calCustomerBalance() method that calculates and returns the credit available on the customer's credit card.

## Usage
Here is an example of how to use the classes:


> CreditCard creditCard = new CreditCard("123456", 500.0);
> Account account = new Account("987654", creditCard);
> Customer customer = new Customer("Bob Mendez", account);
> System.out.println(customer.getAccount().calCustomerBalance()); // 500.0
<br/>
> 
The calCustomerBalance() method will return the credit of the customer's credit card.