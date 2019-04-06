package Library;

public class ScienceFiction extends Book{

	 @Override
	 public int getLateFees(int days) {
	  return 700*days;
	 	}
	}