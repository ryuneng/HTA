package io5; //20231123

import java.io.Serializable;

public class User implements Serializable { // 직렬화 가능한 객체를 만들기 위해 implements Serializable
	// 모든 객체는 serialVersionUID를 가지고 있고, 객체의 내용이 바뀌면 serialVersionUID도 바뀜
	private static final long serialVersionUID = -3137364349244922093L;
	private int no;
	private String id;
	private transient String password; // transient: 직렬화 대상에서 제외
	private String email;
	
	public User(int no, String id, String password, String email) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
	
	
}
