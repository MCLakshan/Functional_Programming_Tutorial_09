object tute_09 extends App{	

	class Rational (p:Int, q:Int){
		require(q != 0, "q must be nun-zero!")

		val P = p;
		val Q = q;

		def neg = new Rational(this.P * -1, this.Q);

		def print() = println(this.P.toString() + " / " + this.Q.toString());
	}


	val r = new Rational(1, 2)
	r.print()

	val n_r = r.neg
	n_r.print()

}