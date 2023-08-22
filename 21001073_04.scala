object tute_09 extends App{	

	class Account(b:Double) {
		var balance: Double = b

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

		//4.3
		def add_Intrest = {
			if(this.balance > 0){
				balance += balance*0.05
			}else if(this.balance < 0){
				balance += balance*0.1
			}
		}
	}

	//4.1
	var acc = List(Account(-100), Account(-200), Account(-300))
	for (a <- acc) {
		println(a.balance)
	}

	//4.2
	def sum_a(l:List[Account]):Double = l.isEmpty match{
		case true => 0
		case _ => l.head.balance + sum_a(l.tail)
	}

	println("Sum of accounts = " + sum_a(acc))

	var a1 = new Account(-1000)
	println()
	println(a1.balance)
	a1.add_Intrest
	println(a1.balance)
	println()

	var a2 = new Account(1000)
	println()
	println(a2.balance)
	a2.add_Intrest
	println(a2.balance)
}