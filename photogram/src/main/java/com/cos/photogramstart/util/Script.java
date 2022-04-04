package com.cos.photogramstart.util;

public class Script {
	
	public  static String back(String msg) {
		StringBuffer sb=new StringBuffer();
		sb.append("<script>");
		sb.append("alter("+msg+");");
		sb.append("histort.back();");
		sb.append("</script>");
		return sb.toString();
		
	}

}
