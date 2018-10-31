package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class MiscRecord {
	
	private String title;
	private String attachment;
	private Collection<String> comments;
	@NotBlank
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@URL
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public Collection<String> getComments() {
		return comments;
	}
	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}
	
	

}
