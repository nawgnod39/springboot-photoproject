package com.cos.photogramstart.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//ioC 에 등록됐다는 의미이자 , 파일을 리턴하는 컨트롤러
public class AuthController {
	
	@GetMapping("/auth/signin")
	public String signinForm() {
		return "auth/signin";
	}

	//회원가입 버튼누르면 auth/signup 로 옴 - 다음으로 auth/signin 이 리턴됨
	@GetMapping("/auth/signup")
	public String signupForm() {
		return "auth/signup";
	}
	@PostMapping("/auth/signup")
	public String signup() {
		return "auth/signin";
	}


}
