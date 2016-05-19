package javaast;

import java.util.Scanner;

abstract class Calls { 
}

class read extends Calls {

	String resolve(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}

class write extends Calls {
	Expression expression;
	write(Expression e){
		this.expression = e;
	}
	
	void resolve(){
		System.out.println(this.expression);
	}
}

class f extends Calls {
	Expression expression;
	f(Expression e){
		this.expression = e;
	}
	void resolve(){
	}
}