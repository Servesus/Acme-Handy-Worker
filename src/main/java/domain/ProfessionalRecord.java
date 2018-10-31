package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class ProfessionalRecord {
	
	private String companyName;
	private LocalDate jobBeggining;
	private LocalDate jobEnding;
	private String rol;
	private String attachment;
	private Collection<String> comment;
	
	@NotBlank
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public LocalDate getJobBeggining() {
		return jobBeggining;
	}
	public void setJobBeggining(LocalDate jobBeggining) {
		this.jobBeggining = jobBeggining;
	}
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public LocalDate getJobEnding() {
		return jobEnding;
	}
	public void setJobEnding(LocalDate jobEnding) {
		this.jobEnding = jobEnding;
	}
	@NotBlank
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
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
