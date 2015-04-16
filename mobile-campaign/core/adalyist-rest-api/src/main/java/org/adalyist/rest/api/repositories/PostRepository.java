package org.adalyist.rest.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.adalyist.rest.api.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
