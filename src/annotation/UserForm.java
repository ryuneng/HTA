package annotation; //20231130

public class UserForm {
	@NotBlank        // name : 비어있으면 안됨
	private String name;
	
	@NotBlank
	@Min(value = 5)  // id : 최소 5글자 제한
	private String id;
	
	@NotBlank
	@Min(value = 8)  // pw : 최소 8글자 제한
	@Max(value = 16) // pw : 최대 16글자 제한
	private String password;
	
	public UserForm(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
}
