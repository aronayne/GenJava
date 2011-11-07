package common.designpatterns.delegation;

/**
 * 
 * When method Delegation.methodToDelegate is called
 * class Delegation delegates the method call to Delegate
 *
 * Rationale. Class Delegation can inherit from one class, 
 * but expose behaviours that belong elsewhere.
 *
 */
public class Delegation {
	
	private Delegate delegate = new Delegate();
	
	public void methodToDelegate(){
		delegate.delegateMethod();
	}

	public static void main(String args[]){
		new Delegation().methodToDelegate();
	}
}
