package chap01test.crud;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import chap01.crud.Member;
import chap01.crud.util.HibernateUtil;

public class MemberTest {

	SessionFactory sessionFac = HibernateUtil.getSessionFactory();

	@Test
	public void test() {

		// one
		Member mem = new Member("hong2234", "hi22");

		insert(mem);

		// select one

		Member selectedMember = selectById(1);
		assertEquals("hi22", selectedMember.getMessage());
		System.out.println(selectById(1).getMessage());

		// // update
		// selectedMember.setMessage("wow");
		// update(selectedMember);
		//
		// Member updateMember = selectById(1);
		// assertEquals("wow", updateMember.getMessage());
		// System.out.println(updateMember.getMessage());
		//
		// //delete
		// detete(updateMember);
		// System.out.println(selectById(1));
		
		HibernateUtil.shutdown();
	}

	private void detete(Member updateMember) {
		Session session = sessionFac.getCurrentSession();
		session.beginTransaction();
		session.delete(updateMember);
		session.getTransaction().commit();
	}

	private void update(Member selectedMember) {
		Session session = sessionFac.getCurrentSession();
		session.beginTransaction();

		session.update(selectedMember);
		session.getTransaction().commit();
	}

	private Member selectById(int i) {

		Session session = sessionFac.getCurrentSession();
		session.beginTransaction();
		Member selectedMember = (Member) session.get(Member.class, i);
		session.getTransaction().commit();

		return selectedMember;
	}

	private void insert(Member mem) {
		Session session = sessionFac.getCurrentSession();
		session.beginTransaction();

		session.save(mem);

		session.getTransaction().commit();

	}

}
