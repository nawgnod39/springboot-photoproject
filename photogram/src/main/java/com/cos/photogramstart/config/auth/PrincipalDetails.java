package com.cos.photogramstart.config.auth;

import java.util.ArrayList;
import java.util.Collection;

 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.photogramstart.domain.user.User;

import lombok.Data;

@Data
public class PrincipalDetails implements UserDetails{	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	
	 public PrincipalDetails(User user) {
		// TODO Auto-generated constructor stub 
		this.user =user;
	}

	 
	 
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> collector = new ArrayList<>(); 
		collector.add(()-> {//람다식 . 공부
				return user.getRole();
		});
		return collector;
	}

	@Override
	public String getPassword() {
	 
		return user.getPassword();
	}

	@Override
	public String getUsername() {
 
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
 
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		 
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		 
		return true;
	}

	@Override
	public boolean isEnabled() {
	 
		return true;
	}
	

}
