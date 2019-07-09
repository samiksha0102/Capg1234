package parallel.com.dao;


	

	public class IncorrectAccountNoException extends RuntimeException{

	    public IncorrectAccountNoException(final String msg){
	        super(msg);
	    }

	    public IncorrectAccountNoException(final String msg,final Throwable e){
	        super(msg,e);
	    }
	}



