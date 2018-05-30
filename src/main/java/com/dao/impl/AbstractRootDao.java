package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRootDao {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	protected <T> void persist(T entity) {
		getSession().persist(entity);
	}

	protected <T> void save(T entity) {
		getSession().save(entity);
	}

	protected <T> void delete(T entity) {
		getSession().delete(entity);
	}

	protected <T> void merge(T entity) {
		getSession().merge(entity);
	}

	public <T, K extends Serializable> T findById(final Class<T> clazz, final K id) {
		return getSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(final Class<T> clazz) {
		return getSession().createCriteria(clazz).list();
	}
}