package javaast;

abstract class Expression {
}

// Numerical expression 
abstract class NumericExpression extends Expression{
	abstract int resolve();
}

// Logic expression (booleans)
abstract class LogicExpression extends Expression {
	abstract boolean resolve();
}

// Const
class Const extends NumericExpression {
	int val;
	Const (int val){
		this.val = val;
	}
	
	int resolve() {
		return val;
	}
}

// UOP => '-'
class Inv extends NumericExpression{
	NumericExpression e;
	
	Inv (NumericExpression e) {
		this.e = e;
	}
	
	int resolve (){
		return -e.resolve();
	}
}

// UOP => 'Not'
class Not extends LogicExpression{
	LogicExpression e;
	Not (LogicExpression e){
		this.e = e;
	}
	
	boolean resolve (){
		return !e.resolve();
	}
}