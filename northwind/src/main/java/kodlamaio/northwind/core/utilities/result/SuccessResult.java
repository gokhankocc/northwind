package kodlamaio.northwind.core.utilities.result;

public class SuccessResult extends Result{
	
	public SuccessResult() {
		
		super(true);     //this clası super ise implement ettigi constructoru calistırmaya yarar..
	}
	
	public SuccessResult(String message) {
		
		super(true,message);
	}


}
