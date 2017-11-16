package yp.action;
 import java.util.Date;
 import com.opensymphony.xwork2.ActionSupport;

import yp.vo.Isbn;
 
public class BookAction extends ActionSupport {
//	  private Registor registor;
// 	public Registor getRegistor() {
//		return registor;
//	}
//	public void setRegistor(Registor registor) {
//		this.registor = registor;
//	}
	private String bookname;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	 
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	 
	public Isbn getIsbn() {
		return isbn;
	}
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}
	private Isbn isbn;
	private String author;
	private String publisher;
	private Date date;
	private double price;
	private int stock;
	public void validate()
	{    
		  //判断出版社名字
		  String name= getPublisher();
		  char[] a=new char[20];
		  if(name.indexOf("出版社")==-1)
		  {
			  addFieldError("publish","没包含出版社");
		  }
		 
	}
	public String execute() throws Exception
	{       
		 
		
 		if(hasErrors())
		{ 
 			return INPUT;
		}
	 
		  return SUCCESS;
		
	}
  
}
