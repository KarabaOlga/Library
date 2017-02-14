package by.htp.edition.bean;

public class Newspaper  extends Edition  {

	private String publisher;
	private int numberIssue;
		
	public Newspaper (String title, int publicDate, int pageCount, String publisher, int numberIssue){
		super(title, publicDate, pageCount);
		this.publisher=publisher;
		this.numberIssue=numberIssue;
	}
	
	public String getPublisher(){
		return publisher;
	}
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}
	public int getNumberIssue(){
		return numberIssue;
	}
	public void setNumberIssue(int numberIssue){
		this.numberIssue=numberIssue;
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
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}

	public String toString(){
		 return "title: "+ getTitle() + "publisher: " + publisher + "number of issue: " + numberIssue +"date of publication: " + getPublicDate() + "page count: " + getPageCount();
	 }
}
