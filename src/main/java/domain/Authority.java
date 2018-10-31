
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public abstract class Authority extends DomainEntity {

<<<<<<< HEAD
	private final String	ADMIN			= "ADMIN";
	private final String	CUSTOMER		= "CUSTOMER";
	private final String	HANDY_WORKER	= "HANDY_WORKER";
	private final String	REFEREE			= "REFEREE";
=======
	private final String	ADMIN		= "ADMIN";
	private final String	CUSTOMER	= "CUSTOMER";
	private final String	REVIEWER	= "REVIEWER";
>>>>>>> da1a154536960bde0902e18777f66d71ce793ea8
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

<<<<<<< HEAD
	public String getHANDY_WORKER() {
		return this.HANDY_WORKER;
	}

	public String getREFEREE() {
		return this.REFEREE;
=======
	public String getREVIEWER() {
		return this.REVIEWER;
>>>>>>> da1a154536960bde0902e18777f66d71ce793ea8
	}

}
