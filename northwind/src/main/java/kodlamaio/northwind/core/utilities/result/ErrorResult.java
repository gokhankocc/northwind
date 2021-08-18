package kodlamaio.northwind.core.utilities.result;

public class ErrorResult extends Result{
	
	public ErrorResult() {
		
		super(false);  //this clası super ise implement ettigi constructoru calistırmaya yarar..d
	}
	
	public ErrorResult(String message) {
		
		super(false,message);
	}


}
