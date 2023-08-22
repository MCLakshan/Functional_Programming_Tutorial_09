object tute_09 extends App{	

	class Account {
		var balance: Double = 0.0

		def Deposit(amount:Double) = this.balance += amount

		def Withdraw(amount:Double) = {
			if (this.balance < amount)
				println("Not enoguh balance")
			else
				this.balance -= amount
		}

		def Transfer(other_acc:Account, amount:Double) = {
			if (this.balance < amount)
				println("Not enoguh balance")
			else{
				this.balance -= amount
				other_acc.balance += amount
			}
		}
	}




	var a1 = new Account
	println("Creating a1:\n    a1.balance = " + a1.balance)

	a1.Deposit(1000.00)
	println("\nDipositing 1000.00 to a1:\n    a1.balance = " + a1.balance)

	a1.Withdraw(2000.00)
	println("\nWithdrawing 2000.00 form a1:\n    a1.balance = " + a1.balance)

	a1.Withdraw(50.00)
	println("\nWithdrawing 50.00 form a1:\n    a1.balance = " + a1.balance)

	var a2 = new Account
	println("\nCreating a2:\n    a1.balance = " + a2.balance)

	a1.Transfer(a2, 500)
	println("\nTransfering 500.00 to a2 form a1:\n    a1.balance = " + a1.balance + "\n    a2.balance = " + a2.balance)
}