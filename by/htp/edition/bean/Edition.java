package by.htp.edition.bean;

public abstract class Edition{
	
	private String title;
	private int publicDate;
	private int pageCount;
	
	public Edition(String title, int publicDate, int pageCount){
		this.title=title;
		this.publicDate=publicDate;
		this.pageCount=pageCount;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public int getPublicDate(){
		return publicDate;
	}
	public void setPublicDate(int pablicDate){
		this.publicDate=pablicDate;
	}
	public int getPageCount(){
		return pageCount;
	}
	public void setPageCount(int pageCount){
		this.pageCount=pageCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + pageCount;
		result = prime * result + publicDate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edition other = (Edition) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (publicDate != other.publicDate)
			return false;
		return true;
	}

	@Override
	public String toString(){
		 return "title: "+ title+ "date of publication: " + publicDate + "page count: " + pageCount;
	 }

}
