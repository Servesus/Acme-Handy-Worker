
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Report extends DomainEntity {

	//Attributes
	private Date	moment;
	private String	description;
	private String	attachment;
	private boolean	isFinal;


	//Getters and setters
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
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


	//Relationships
	private Collection<Note>		notes;
	private Collection<Complain>	complaint;
	private Collection<Referee>		referees;


	@Valid
	public Collection<Note> getNotes() {
		return this.notes;
	}

	@Valid
	public Collection<Complain> getComplaint() {
		return this.complaint;
	}

	@NotNull
	@Valid
	public Collection<Referee> getReferees() {
		return this.referees;
	}

	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

	public void setComplaint(final Collection<Complain> complaint) {
		this.complaint = complaint;
	}

	public void setReferees(final Collection<Referee> referees) {
		this.referees = referees;
	}

}
