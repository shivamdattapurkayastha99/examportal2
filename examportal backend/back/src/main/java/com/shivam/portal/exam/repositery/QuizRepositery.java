package com.shivam.portal.exam.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.portal.exam.entity.exam.Category;
import com.shivam.portal.exam.entity.exam.Quiz;

@Repository
public interface QuizRepositery extends JpaRepository<Quiz, Long>{

	List<Quiz> findBycategory(Category category);

	List<Quiz> findByActive(boolean b);

	List<Quiz> findByCategoryAndActive(Category c, boolean b);

}
