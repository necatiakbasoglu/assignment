package sources;

import exceptions.CustomException;

public class Third {
	public void run() throws CustomException {
		Second second = new Second();
		
		try {
			second.callEx();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			CustomException customEx = new CustomException("An other ex is created!");
			customEx.initCause(e);
			throw customEx;
		}
	}
}
