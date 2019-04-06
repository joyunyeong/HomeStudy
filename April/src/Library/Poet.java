package Library;

public class Poet extends Book{

	 @Override
	 public int getLateFees(int days) {
	  return 300*days;
	 	}
	}