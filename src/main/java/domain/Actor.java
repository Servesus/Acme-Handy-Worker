
package domain;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public abstract class Actor extends DomainEntity {

	private String			name;
	private String			middleName;
	private String			surname;
	private String			photo;
	private String			email;
	private String			phoneNumber;
	private String			address;
	private final String	make	= this.name + this.middleName + this.surname;
	private boolean			isSuspicious;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	@Pattern(regexp = "^([+-]\\d+\\s+)?(\\([0-9]+\\)\\s+)?([\\d\\w\\s-]+)$")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}
	@NotBlank
	public String getMake() {
		return this.make;
	}

	public boolean isSuspicious() {
		return this.isSuspicious;
	}

}
