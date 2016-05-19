package javaast;

abstract class LogicOperations extends LogicExpression {
	LogicExpression e1, e2;
}

class AND extends LogicOperations {
	AND (LogicExpression e1, LogicExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() && this.e2.resolve());
	}
}

class OR extends LogicOperations {
	OR (LogicExpression e1, LogicExpression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	boolean resolve(){
		return (this.e1.resolve() || this.e2.resolve());
	}
}

