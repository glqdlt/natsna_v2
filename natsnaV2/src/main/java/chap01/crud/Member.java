package chap01.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Ŭ������ ���ÿ� ���̺� ���� ���
@Entity
public class Member {

	// �ڵ����� ���� �ö�, auto incount �������ε�?
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
