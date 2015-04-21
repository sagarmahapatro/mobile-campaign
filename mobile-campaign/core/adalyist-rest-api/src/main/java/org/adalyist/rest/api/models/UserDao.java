package org.adalyist.rest.api.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {
	// ==============
	  // PRIVATE FIELDS
	  // ==============
	  
	  // An EntityManager will be automatically injected from entityManagerFactory
	  // setup on DatabaseConfig class.
	 @PersistenceContext
	 private EntityManager _entityManager;
	  // ==============
	  // PUBLIC METHODS
	  // ==============
	  
	  /**
	   * Method create
	   * 
	   * Save the user in the database.
	   */
	  public void create(User user) {
	    _entityManager.persist(user);
	    return;
	  }
	  
	  /**
	   * Method delete
	   * 
	   * Delete the user from the database.
	   */
	  public void delete(User user) {
	    if (_entityManager.contains(user))
	      _entityManager.remove(user);
	    else
	      _entityManager.remove(_entityManager.merge(user));
	    return;
	  }
	  
	  /**
	   * Method getAll
	   * 
	   * Return all the users stored in the database.
	   */
	  @SuppressWarnings("unchecked")
	  public List getAll() {
	    return _entityManager.createQuery("from User").getResultList();
	  }
	  
	  /**
	   * Method getByEmail
	   * 
	   * Return the user having the passed email.
	   */
	  public User getByEmail(String email) {
	    return (User) _entityManager.createQuery(
	        "from User where email = :email")
	        .setParameter("email", email)
	        .getSingleResult();
	  }

	  /**
	   * Method getById
	   * 
	   * Return the user having the passed id.
	   */
	  public User getById(long id) {
	    return _entityManager.find(User.class, id);
	  }

	  /**
	   * Method update
	   * 
	   * Update the passed user in the database.
	   */
	  public void update(User user) {
	    _entityManager.merge(user);
	    return;
	  }
}
