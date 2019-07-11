package parallel.com.dao;

public class InSufficientAmountException extends RuntimeException {
	

	    public  InSufficientAmountException(final String msg){
	        super(msg);
	    }

	    public  InSufficientAmountException(final String msg,final Throwable e){
	        super(msg,e);
	    }
	}




