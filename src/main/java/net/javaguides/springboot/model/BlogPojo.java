package net.javaguides.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tiger")
public class BlogPojo {
	
	
	@Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
	
	@Column(name="Title")
	private String Title;
	
	@Column(name = "TextBody")
	private String TextBody; 
	
	@Column(name = "Catergory")
	private String Catergory;

	@Override
	public String toString() {
		return "BlogPojo [id=" + id + ", Title=" + Title + ", TextBody=" + TextBody + ", Catergory=" + Catergory + "]";
	}

	public Long getId() {
		System.out.print("⭐⭐⭐⭐⭐⭐");
		System.out.print(id);
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getTextBody() {
		return TextBody;
	}

	public void setTextBody(String textBody) {
		TextBody = textBody;
	}

	public String getCatergory() {
		return Catergory;
	}

	public void setCatergory(String catergory) {
		Catergory = catergory;
	}
	
//public BlogPojo()
//{
//	
//}
//
//public BlogPojo(String Title,String TextBody,String Catergory)
//{
//super();
//this.Title=Title;
//this.Catergory=Catergory;
//this.TextBody=TextBody;
//}


//	public String getTitle() {
//		return Title;
//	}
//
//	public void setTitle(String title) {
//		Title = title;
//	}
//
//	public String getTextBody() {
//		return TextBody;
//	}
//
//	public void setTextBody(String textBody) {
//		TextBody = textBody;
//	}
//
//	public String getCatergory() {
//		return Catergory;
//	}
//
//	public void setCatergory(String catergory) {
//		Catergory = catergory;
//	}
//
//	@Override
//	public String toString() {
//		return "BlogPojo [Title=" + Title + ", TextBody=" + TextBody + ", Catergory=" + Catergory + "]";
//	}
//	
	
}
