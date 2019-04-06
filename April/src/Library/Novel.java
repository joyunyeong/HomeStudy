package Library;

public class Novel extends Book{

	 @Override
	 public int getLateFees(int days) {
	  return 500*days;
	 	}
	}