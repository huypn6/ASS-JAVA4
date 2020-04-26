package com.java4.dao;

import java.util.List;

import com.java4.entities.Message;

public interface MessageDao {

	List<Message> getAll();

	Boolean delete(Integer id);

	Message insert(Message message);

	Message update(Message message);

}
