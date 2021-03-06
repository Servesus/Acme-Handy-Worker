
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class EndorserRecord extends DomainEntity {

	private String				fullName;
	private String				email;
	private String				phone;
	private String				linkedInProfile;
	private Collection<String>	comments;


	@NotBlank
	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}
	@Email
	public String getEmail() {
		return this.email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	@NotBlank
	@Pattern(regexp = "^(+[1-9]\\d{0,2}([1-9]\\d{0,2})\\d{4,})$|^(+[1-9]\\d{0,2} \\d{4,})$|^(\\d{4,})$")
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	@URL
	public String getLinkedInProfile() {
		return this.linkedInProfile;
	}
	public void setLinkedInProfile(final String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}
	public Collection<String> getComments() {
		return this.comments;
	}
	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}
}
