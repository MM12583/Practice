package hw ;

abstract class DateException extends Exception {

	abstract String getErrorMesage() ;

	abstract void setErrorMesage() ;
}

class YearException extends DateException{

	private String errorMesage ;
	
	YearException() {
		setErrorMesage() ;
	}

	@Override
	String getErrorMesage() {
		return errorMesage ;
	}

	@Override
	void setErrorMesage() {
		errorMesage = "輸入年分不符規定 " ;
	}
	
}

class MonthException extends DateException{

	private String errorMesage ;
	
	MonthException() {
		setErrorMesage() ;
	}
	
	@Override
	String getErrorMesage() {
		return errorMesage ;
	}

	@Override
	void setErrorMesage() {
		errorMesage = "輸入月份不符規定" ;
	}
	
}

class DayException extends DateException{

	private String errorMesage ;
	
	DayException() {
		setErrorMesage() ;
	}
	
	@Override
	String getErrorMesage() {
		return errorMesage ;
	}

	@Override
	void setErrorMesage() {
		errorMesage = "輸入日期不符規定 " ;
	}
}