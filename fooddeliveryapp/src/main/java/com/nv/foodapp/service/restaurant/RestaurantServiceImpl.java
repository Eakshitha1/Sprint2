package com.nv.foodapp.service.restaurant;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.foodapp.entity.Bill;
import com.nv.foodapp.entity.Item;
import com.nv.foodapp.entity.Restaurant;
import com.nv.foodapp.exception.InvalidInputDataException;
import com.nv.foodapp.repository.bill.IBillRepository;
import com.nv.foodapp.repository.item.ItemRepository;
import com.nv.foodapp.repository.restaurant.IRestaurantRepository;

@Service
public class RestaurantServiceImpl implements IRestaurantService {

	@Autowired
	IRestaurantRepository restaurantRepository;

	@Autowired
	IBillRepository billRepository;

	@Override
	public Restaurant addRestaurant(Restaurant res) throws Exception {
		// TODO Auto-generated method stub
		if (res != null) {
			if (res.getRestaurantName().equals("")) {
				throw new InvalidInputDataException("restuarant name", "restuarant name is null");
			}
			Restaurant savedRestaurant = restaurantRepository.save(res);
			return savedRestaurant;
		} else
			throw new NullPointerException("restaurant is null");

	}

	@Override
	public Restaurant viewRestaurantById(int id) {
		// TODO Auto-generated method stub
		if (id >= 1) {
			Restaurant savedRestaurant = restaurantRepository.getReferenceById(id);
			if (savedRestaurant != null)
				return savedRestaurant;
			else {
				throw new EntityNotFoundException("Invalid Restaurant ID : " + id);
			}
		}
		return null;

	}

	@Override
	public List<Restaurant> viewAllRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

	@Override
	public boolean removeRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		restaurantRepository.deleteById(restaurantId);
		return true;

	}

	@Override
	public List<Restaurant> findAllByRestaurantId(int id) {
		// TODO Auto-generated method stub
		List<Restaurant> list=restaurantRepository.findAllByRestaurantId(id);
		return list;
	}

	

	
	

}
