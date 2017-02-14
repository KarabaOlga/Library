package by.htp.edition.bean;

public class Book extends Edition {
	
	private String author;
	private int circulation;
	
	public Book(String title, int publicDate, int pageCount, String author, int circulation){
		super(title, publicDate,pageCount);
		this.author=author;
		this.circulation=circulation;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public int getCirculation(){
		return circulation;
	}
	public void setCirculation(int circulation){
		this.circulation=circulation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}

	public String toString(){
		 return "title: "+ getTitle() + "author: " +author +"date of publication: " + getPublicDate() + "page count: " + getPageCount() + "circulation: " + circulation;
	 }
}



