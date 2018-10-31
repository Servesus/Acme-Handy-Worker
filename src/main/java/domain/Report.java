
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Report extends DomainEntity {

	private Date	moment;
	private String	description;
	private String	attachment;
	private boolean	isFinal;


	public Date getMoment() {
		return this.moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	@URL
	public String getAttachment() {
		return this.attachment;
	}

	public boolean isFinal() {
		return this.isFinal;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}

	public void setFinal(final boolean isFinal) {
		this.isFinal = isFinal;
	}

}
