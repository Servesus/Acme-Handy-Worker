
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Note extends DomainEntity {

	private String	author;
	private Date	moment;
	private String	authorComment;
	private String	hwComment;
	private String	customerComment;


	@NotBlank
	public String getAuthor() {
		return this.author;
	}

	public Date getMoment() {
		return this.moment;
	}

	@NotBlank
	public String getAuthorComment() {
		return this.authorComment;
	}

	public String getHWComment() {
		return this.hwComment;
	}

	public String getCustomerComment() {
		return this.customerComment;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setAuthorComment(final String authorComment) {
		this.authorComment = authorComment;
	}

	public void setHWComment(final String hwComment) {
		this.hwComment = hwComment;
	}

	public void setCustomerComment(final String customerComment) {
		this.customerComment = customerComment;
	}
}
