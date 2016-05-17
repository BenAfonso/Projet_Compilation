package javaast;

abstract class CompareOperations extends LogicExpression {
	NumericExpression e1, e2;
}

// Greater Than
class GT extends CompareOperations {
	GT (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() > this.e2.resolve());
	}
}

// Lower Than
class LT extends CompareOperations {
	LT (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() < this.e2.resolve());
	}
}

// Lower or equal
class LOE extends CompareOperations {
	LOE (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() <= this.e2.resolve());
	}
}

// Greater or equal
class GOE extends CompareOperations {
	GOE (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() >= this.e2.resolve());
	}
}

// Equal
class Equal extends CompareOperations {
	Equal (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() == this.e2.resolve());
	}
}

// Not equal
class NotEqual extends CompareOperations {
	NotEqual (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() != this.e2.resolve());
	}
}