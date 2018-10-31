
package domain;

import java.util.Date;

public class Finder extends DomainEntity {

	private String	singleKeyWord;
	private Integer	rangeStart;
	private Integer	rangeFinish;
	private Date	dateStartRange;
	private Date	dateFinishRange;


	public String getSingleKeyWord() {
		return this.singleKeyWord;
	}

	public void setSingleKeyWord(final String singleKeyWord) {
		this.singleKeyWord = singleKeyWord;
	}

	public Integer getRangeStartRange() {
		return this.rangeStart;
	}

	public void setRangeStartRange(final Integer rangeStartRange) {
		this.rangeStart = rangeStartRange;
	}

	public Integer getRangeFinishRange() {
		return this.rangeFinish;
	}

	public void setRangeFinishRange(final Integer rangeFinishRange) {
		this.rangeFinish = rangeFinishRange;
	}

	public Date getDateStartRange() {
		return this.dateStartRange;
	}

	public void setDateStartRange(final Date dateStartRange) {
		this.dateStartRange = dateStartRange;
	}

	public Date getDateFinishRange() {
		return this.dateFinishRange;
	}

	public void setDateFinishRange(final Date dateFinishRange) {
		this.dateFinishRange = dateFinishRange;
	}

}
