package common.designpatterns.aggregation;

/**
 * Tests aggregation
 * 
 * Once there are no more references to a particular instance of class Aggregation, 
 * its instance of class TestHas will not be destroyed. 
 * In this example, both Aggregation and NewAggregation must be garbage collected 
 * before TestHas will be destroyed.
 * Rationale. Allows instances to reuse objects.
 * Further Study. http://faq.javaranch.com/java/AssociationVsAggregationVsComposition
 */
import common.shared.TestHas;

public class NewAggregation {

	private TestHas testHas = new TestHas();

	  public NewAggregation() {
		  Aggregation aggregation = new Aggregation(this.testHas);
	  }

	  
}
