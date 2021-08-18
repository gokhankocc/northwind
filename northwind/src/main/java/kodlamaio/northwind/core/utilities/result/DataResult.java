package kodlamaio.northwind.core.utilities.result;

public class DataResult<T> extends Result{

	
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);   //this clası super ise implement ettigi constructoru calistırmaya yarar..succcess ve messageyi get eder
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return this.data;
	}

	

}
