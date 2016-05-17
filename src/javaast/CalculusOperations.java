package javaast;

abstract class CalculusOperations extends NumericExpression {
	NumericExpression e1, e2;
}

// Add operation between two Numeric expression
class Add extends CalculusOperations {
	Add (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	int resolve (){
		return e1.resolve() + e2.resolve();
	}
}

// Substract operation between two Numeric expressions
class Substract extends CalculusOperations {
	Substract (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	int resolve (){
		return e1.resolve() - e2.resolve();
	}
}

// Multiply operation between two Numeric expressions
class Multiply extends CalculusOperations {
	Multiply (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	int resolve (){
		return e1.resolve() * e2.resolve();
	}
}

// Divide operation between two Numeric expressions
class Divide extends CalculusOperations {
	Divide (NumericExpression e1, NumericExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	int resolve (){
		return e1.resolve() / e2.resolve();
	}
}