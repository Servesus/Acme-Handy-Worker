package domain;

import java.util.Collection;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EndorserRecord {
	
	private String fullName;
	private String email;
	private String phone;
	private String linkedInProfile;
	private Collection<String> comments;
	@NotBlank
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@NotBlank
	@Pattern(regexp = "^(+[1-9]\\d{0,2}([1-9]\\d{0,2})\\d{4,})$|^(+[1-9]\\d{0,2} \\d{4,})$|^(\\d{4,})$")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@URL
	public String getLinkedInProfile() {
		return linkedInProfile;
	}
	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}
	public Collection<String> getComments() {
		return comments;
	}
	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}
}
