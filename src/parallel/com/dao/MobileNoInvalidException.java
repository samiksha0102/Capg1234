package parallel.com.dao;


public class MobileNoInvalidException extends RuntimeException{

    public MobileNoInvalidException(final String msg){
        super(msg);
    }

    public MobileNoInvalidException(final String msg,final Throwable e){
        super(msg,e);
    }

}

