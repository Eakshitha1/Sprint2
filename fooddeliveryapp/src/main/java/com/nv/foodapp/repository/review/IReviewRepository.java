package com.nv.foodapp.repository.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nv.foodapp.entity.Review;

public interface IReviewRepository extends JpaRepository<Review,Long>{
	
	public List<Review> findAllByRestaurantId(Long id);

}
