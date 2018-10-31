package domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Curricula {
	
	private String ticker;
	private PersonalRecord personalRecord;
	private Collection<EducationalRecord> educationalRecord;
	private Collection<ProfessionalRecord> professionalRecord;
	private Collection<EndorserRecord> endorserRecord;
	private Collection<MiscRecord> miscRecord;
	

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^(\\d{6}-\\w{6})$")
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	@NotNull
	@Valid
	public PersonalRecord getPersonalRecord() {
		return personalRecord;
	}
	public void setPersonalRecord(PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}
	@Valid
	public Collection<EducationalRecord> getEducationalRecord() {
		return educationalRecord;
	}
	public void setEducationalRecord(Collection<EducationalRecord> educationalRecord) {
		this.educationalRecord = educationalRecord;
	}
	@Valid
	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return professionalRecord;
	}
	public void setProfessionalRecord(
			Collection<ProfessionalRecord> professionalRecord) {
		this.professionalRecord = professionalRecord;
	}
	@Valid
	public Collection<EndorserRecord> getEndorserRecord() {
		return endorserRecord;
	}
	public void setEndorserRecord(Collection<EndorserRecord> endorserRecord) {
		this.endorserRecord = endorserRecord;
	}
	@Valid
	public Collection<MiscRecord> getMiscRecord() {
		return miscRecord;
	}
	public void setMiscRecord(Collection<MiscRecord> miscRecord) {
		this.miscRecord = miscRecord;
	}
	
}
