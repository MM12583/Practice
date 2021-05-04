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
		errorMesage = "��J�~�����ųW�w " ;
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
		errorMesage = "��J������ųW�w" ;
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
		errorMesage = "��J������ųW�w " ;
	}
}