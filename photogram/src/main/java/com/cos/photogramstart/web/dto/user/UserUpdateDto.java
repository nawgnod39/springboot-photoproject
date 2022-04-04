package com.cos.photogramstart.web.dto.user;

import com.cos.photogramstart.domain.user.User;

public class UserUpdateDto {
	
	private String name;//필수
	private String password;//필수 
	private String website;
	private String bio;
	private String phone;
	private String gender;
	
	//코드 수정 필요
	public User toEntity() {
		return User.builder()
				.username(name)
				.password(password)
				.website(website)
				.bio(bio)
				.phone(phone)
				.gender(gender)
				.build();

	}
}
