public class Book {
	protected String cntNum;
	protected String bookName;
	public Book(String cntNum,String bookName){
		this.cntNum = cntNum;
		this.bookName = bookName;
	}
	public void disp(){
		System.out.println("cntNum="+cntNum+"bookName="+bookName);
	}
	public String getCntNum() {
		return cntNum;
	}
	public String getBookName() {
		return bookName;
	}
}
