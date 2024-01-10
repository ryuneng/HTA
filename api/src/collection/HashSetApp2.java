package collection; //20231116

import java.util.HashSet;
import java.util.Objects;

public class HashSetApp2 {
	public static void main(String[] args) {
		HashSet<User> set = new HashSet<>();
		
		set.add(new User("kim", "김유신"));
		set.add(new User("kang", "강감찬"));
		set.add(new User("lee", "이순신"));
		set.add(new User("ryu", "류관순"));
		set.add(new User("ahn", "안중근"));
		set.add(new User("hong", "홍길동"));
		set.add(new User("hong", "홍길동"));
		set.add(new User("hong", "홍길동"));
		
		for(User user : set) {
			System.out.println(user.id + ", " + user.name + ", " + user);
		}
	}
	
	static class User {
		String id;
		String name;
		
		public User(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/*
		 * hashCode()와 equals() 메소드를 재정의해서
		 * id 값이 같은 User 객체는 같은 객체로 판단하도록 만듦
		 */
		@Override
		public int hashCode() {
			return Objects.hash(id); // id 기준으로 hashCode를 재정의 => id가 같으면 같은 hashCode로 인식되도록 해서 중복 안됨
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(id, other.id);
		}
		
		
	}
}
