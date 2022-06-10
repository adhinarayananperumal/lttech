package creditcard.creditcard;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

public class T {
	
	@Async
	static public AsyncResult<String> asyncMethodWithReturnType() {
		System.out.println("Execute method asynchronously - " 
			      + Thread.currentThread().getName());
			    try {
			        Thread.sleep(5000);
			        System.out.println("Execute method asynchronously - " 
						      + Thread.currentThread().getName());
			        return new AsyncResult<String>("hello world !!!!");
			    } catch (InterruptedException e) {
			        //
			    }

			    return null;
	}

}
