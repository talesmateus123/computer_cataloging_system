/** 
 * This is the class "UserDTO". That class will be to represent a computer user dto.
 * 
 * @author Tales Mateus de Oliveira Ferreira <talesmateus1999@hotmail.com>
 */
package com.pml.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.pml.domain.User;

public class UserNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotNull(message = "This field is mandatory")
	private Long id;
	@NotEmpty(message = "This field cannot be empty")
	private String login;
	@NotEmpty(message = "This field cannot be empty")
	private String password;
	
	public UserNewDTO() {		
	}
	
	public UserNewDTO(User user) {
		this.id = user.getId();
		this.login = user.getLogin();
		this.password = user.getPassword();
	}
	
	public UserNewDTO(Long id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserNewDTO other = (UserNewDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
