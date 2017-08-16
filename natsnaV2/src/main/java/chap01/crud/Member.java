package chap01.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// 클래스인 동시에 테이블 임을 명시
@Entity
public class Member {

	// 자동으로 값이 올라감, auto incount 같은거인듯?
	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Member(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return id+","+name+","+message;
	}
}
