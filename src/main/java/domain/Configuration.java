
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.Range;

public class Configuration extends DomainEntity {

	//Attributes
	private int		maxResults	= 10;
	private int		maxTime		= 1;
	private Date	lastUpdate;


	@Range(min = 10, max = 100)
	public int getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(final int maxResults) {
		this.maxResults = maxResults;
	}
	@Range(min = 1, max = 24)
	public int getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(final int maxTime) {
		this.maxTime = maxTime;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(final Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
