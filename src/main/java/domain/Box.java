package domain;

import java.util.Collection;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class Box {
	
	private String name;
	private Boolean isSystem;
	private Collection<Box> parentBoxes;
	private Collection<Box> childBoxes;
	private Collection<Message> messages;
	
	@NotBlank
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsSystem() {
		return isSystem;
	}
	public void setIsSystem(Boolean isSystem) {
		this.isSystem = isSystem;
	}
	@Valid
	public Collection<Box> getParentBoxes() {
		return parentBoxes;
	}
	public void setParentBoxes(Collection<Box> parentBoxes) {
		this.parentBoxes = parentBoxes;
	}
	@Valid
	public Collection<Box> getChildBoxes() {
		return childBoxes;
	}
	public void setChildBoxes(Collection<Box> childBoxes) {
		this.childBoxes = childBoxes;
	}
	@Valid
	public Collection<Message> getMessages() {
		return messages;
	}
	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
}
