
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public abstract class Authority extends DomainEntity {

	private final String	ADMIN			= "ADMIN";
	private final String	CUSTOMER		= "CUSTOMER";
	private final String	HANDY_WORKER	= "HANDY_WORKER";
	private final String	REFEREE			= "REFEREE";
	private String			authority;


	@NotBlank
	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(final String authority) {
		this.authority = authority;
	}

	public String getADMIN() {
		return this.ADMIN;
	}

	public String getCUSTOMER() {
		return this.CUSTOMER;
	}

	public String getHANDY_WORKER() {
		return this.HANDY_WORKER;
	}

	public String getREFEREE() {
		return this.REFEREE;
	}

}
