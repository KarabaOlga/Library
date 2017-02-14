package by.htp.edition.bean;

public class Magazine  extends Edition  {

	private String publisher;
	private String kind;
			
	public Magazine(String title, int publicDate, int pageCount, String publisher, String kind){
		super(title, publicDate, pageCount);
		this.publisher=publisher;
		this.kind=kind;
	}


	public String getPublisher(){
		return publisher;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
	public String getKind(){
		return kind;
	}
	public void setKind(String kind){
		this.kind=kind;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
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
		Newspaper other = (Newspaper) obj;
		if (publisher == null) {
			if (other.getPublisher() != null)
				return false;
		} else if (!publisher.equals(other.getPublisher()))
			return false;
		return true;
	}

	public String toString(){
		 return "title: "+ getTitle() + "publisher: " + publisher + "kind of magazine" + kind + "date of publication: " + getPublicDate() + "page count: " + getPageCount();
	 }
}


