// Exercise 3.11: Account.java
/*
Modify class Account (Fig. 3.8, page 98) to provide a method called withdraw
that withdraws money from an Account.
Ensure that the withdrawal amount does not exceed the Account’s balance.
If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance."
Modify class AccountTest (Fig. 3.9) to test method withdraw .
===============================================================================
                        Account
===============================================================================
- name : String
- balance : double
===============================================================================
<<constructor>> Account( name : String, balance : double )
+ deposit( depositAmount : double )
+ withdraw( withdrawAmount : double )
+ setName( name : String )
+ getName() : String
+ getBalance() : double
===============================================================================
*/
