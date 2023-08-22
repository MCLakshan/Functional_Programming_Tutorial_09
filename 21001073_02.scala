object tute_09 extends App{	

	def GCD(a: Int, b: Int): Int = b match {
	  case 0 => a
	  case x if a < 0 => GCD(-a, b)
	  case x if b < 0 => GCD(a, -b)
	  case x if x > a => GCD(x, a)
	  case _ => GCD(b, a % b)
	}


	class Rational (p:Int, q:Int){
		require(q != 0, "q must be nun-zero!")

		val P = p;
		val Q = q;

		def neg = new Rational(this.P * -1, this.Q);

		def print() = println(this.P.toString() + " / " + this.Q.toString());

		def -(r:Rational):Rational = {
			var p1 = this.P
			var q1 = this.Q
			var p2 = r.P
			var q2 = r.Q
			var gcd = GCD(p1*q2 - p2*q1, q1*q2)
			return new Rational((p1*q2 - p2*q1) / gcd, (q1*q2) / gcd)
			//return new Rational((p1*q2 - p2*q1), (q1*q2))
	
		}
	}

	var x = new	Rational(3, 4)
	var y = new	Rational(5, 8)
	var z = new	Rational(2, 7)
	//x
	x.print()
	//y
	y.print()
	//z
	z.print()

	var x_y_z = x - y - z
	//x_y_z
	x_y_z.print()

}