package com.testautomation.junit5;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import java.time.Duration;
import org.junit.jupiter.api.Test;

/*Sometimes, we have to write JUnit tests where we have to access some external systems on network. 
 * There is never 100% certainty that these external systems will be available while executing the test cases. 
 * That’s why it is advisable to use timeout property of JUnit framework while writing test cases with external
 *  dependencies.*/
public class JUnit5Timeout {

	@Test
	public void timeoutNotExceeded() {
		assertTimeout(ofMinutes(2), () -> {
			// perform task that takes less than 2 minutes.
			System.out.println("This test will be executed successfully without any failure");
		});
	}

	// here execution of the Executable or ThrowingSupplier will not be aborted
	// if the timeout is exceeded
	@Test
	public void timeoutExceeded() {
		// The below assertion fails with an error message
		assertTimeout(ofMillis(10), () -> {
			Thread.sleep(100);
		});
	}

	// here execution of the Executable or ThrowingSupplier will be preemptively
	// aborted
	// if the timeout is exceeded
	@Test
	public void timeoutExceededAndTestCancelled() {
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			Thread.sleep(200);
		});
	}
}
