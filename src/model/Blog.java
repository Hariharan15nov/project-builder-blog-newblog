package model;
// Type your code
import java.time.LocalDate;

public class Blog {


	private String title;
	private String description;
	private LocalDate postedOn;
	public Blog(String title, String description,LocalDate postedOn) {
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDateTime postedOn) {
		this.postedOn = postedOn;
	}	
	
	
}
