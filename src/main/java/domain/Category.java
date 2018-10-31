
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	private String	name;


	@NotBlank
	public String getNombre() {
		return this.name;
	}
	public void setNombre(final String name) {
		this.name = name;
	}
}
