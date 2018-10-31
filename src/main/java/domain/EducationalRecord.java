package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class EducationalRecord {
	
	private String diplomasTitle;
	private LocalDate studiesBeggining;
	private LocalDate studiesEnding;
	private String institution;
	private String attachment;
	private Collection<String> comment;
	
	@NotBlank
	public String getDiplomasTitle() {
		return diplomasTitle;
	}
	public void setDiplomasTitle(String diplomasTitle) {
		this.diplomasTitle = diplomasTitle;
	}
	@Past
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public LocalDate getStudiesBeggining() {
		return studiesBeggining;
	}
	public void setStudiesBeggining(LocalDate studiesBeggining) {
		this.studiesBeggining = studiesBeggining;
	}
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public LocalDate getStudiesEnding() {
		return studiesEnding;
	}
	public void setStudiesEnding(LocalDate studiesEnding) {
		this.studiesEnding = studiesEnding;
	}
	@NotNull
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	@URL
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public Collection<String> getComment() {
		return comment;
	}
	public void setComment(Collection<String> comment) {
		this.comment = comment;
	}
}
