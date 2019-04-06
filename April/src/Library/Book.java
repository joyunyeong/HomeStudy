package Library;

	public abstract class Book {
		
		protected String bookId;
		protected String subject;
		protected String author;
		protected boolean loaned; // true 대여중, false 대여가능
	
		public boolean equals(String bookId) {
			if (this.bookId.equals(bookId))
				return true;
			else
				return false;
		}
	
		public abstract int getLateFees(int days);
	
		public String getBookId() {
			return bookId;
		}
	
		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
	
		public String getSubject() {
			return subject;
		}
	
		public void setSubject(String subject) {
			this.subject = subject;
		}
	
		public String getAuthor() {
			return author;
		}
	
		public void setAuthor(String author) {
			this.author = author;
		}
	
		public boolean isLoaned() {
			return loaned;
		}
	
		public void setLoaned(boolean loaned) {
			this.loaned = loaned;
		}
}