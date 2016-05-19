package javaast;

public class Variable {
	String identifier;
	Expression value;
	public Variable(String identifier, Expression value){
		this.identifier = identifier;
		this.value = value;
	}
	void affect(Expression value){
		this.value = value;
	}
}
