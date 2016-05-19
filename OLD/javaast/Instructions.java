package javaast;

abstract class Instructions {
	abstract void resolve ();
}

// If Statement
class ifStatement extends Instructions {
	LogicExpression expression;
	Instructions thenStatement;
	Instructions elseStatement;
	ifStatement (LogicExpression cond, Instructions thenClause, Instructions elseClause){
		this.expression = cond;
		this.thenStatement = thenClause;
		this.elseStatement = elseClause;
	}
	
	void resolve(){
		if (this.expression.resolve()){
			this.thenStatement.resolve();
		}else{
			this.elseStatement.resolve();
		}
	}// Resolve
}


// While Loop
class whileLoop extends Instructions {
	LogicExpression expression;
	Instructions loop;
	whileLoop (LogicExpression expr, Instructions loop){
		this.expression = expr;
		this.loop = loop;
	}
	
	void resolve(){
		while (this.expression.resolve()){
			this.loop.resolve();
		}
	}// Resolve
	
}

// Affect
class affect extends Instructions {
	String identifier;
	Expression expression;
	affect(String identifier, Expression e){
		this.identifier = identifier;
		this.expression = e;
	}
	void resolve(){
	}
}

class skip extends Instructions {
	void resolve(){
	}
}

class multipleInstructions extends Instructions {
	Instructions i1, i2;
	multipleInstructions(Instructions i1, Instructions i2){
		this.i1 = i1;
		this.i2 = i2;
	}
	// Resolves the two instructions
	void resolve(){
		this.i1.resolve();
		this.i2.resolve();
	}
}