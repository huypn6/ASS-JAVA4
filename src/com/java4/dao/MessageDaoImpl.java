package com.java4.dao;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java4.entities.Message;
import com.java4.utils.HibernateUtils;

public class MessageDaoImpl implements MessageDao {

	public static final SessionFactory factory = HibernateUtils.buildSessionFactory();

	@Override
	public List<Message> getAll() {
		// 1. get session
		try {
			Session session = factory.openSession();
			// 2. call db => data
			Query query = session.createQuery("From Message");
			@SuppressWarnings("unchecked")
			List<Message> messagesList = query.getResultList();
			// 3. close session
			session.close();
			// 4 return data
			return messagesList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message insert(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message update(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

}
