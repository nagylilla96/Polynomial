/**
 * PolinomTestRunneer class
 * The PolinomTest runner class
 *
 * @author Nagy Lilla
 * @version 10 Mar 2017
 */

package polinom;	

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PolinomTestRunner {

	public static void main(String[] args){
		Result result = JUnitCore.runClasses(MonomTest.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	    System.out.println(result.wasSuccessful());
	}
}
