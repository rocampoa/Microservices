package com.bdg.resources;

import com.bdg.model.Restaurant;
import com.bdg.model.Entity;
import com.bdg.service.RestaurantService;
import com.bdg.vo.RestaurantVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by Rafael on 3/07/2017.
 */
@RestController
@RequestMapping("v1/restaurants")
public class RestaurantController {

  protected Logger logger = Logger.getLogger(RestaurantController.class.getName());

  protected RestaurantService restaurantService;

  @Autowired
  public RestaurantController(RestaurantService restaurantService) {
    this.restaurantService = restaurantService;
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Collection<Restaurant>> findByName(@RequestParam("name") String name) {
    name = name.trim().toLowerCase();
    Collection<Restaurant> restaurants;
    try {
      restaurants = restaurantService.findByName(name);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseEntity<Collection<Restaurant>>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return restaurants.size() > 0 ? new ResponseEntity<Collection<Restaurant>>(restaurants, HttpStatus.OK) : new ResponseEntity<Collection<Restaurant>>(HttpStatus.NO_CONTENT);
  }

  @RequestMapping(value = "/{restaurant_id}", method = RequestMethod.GET)
  public ResponseEntity<Entity> findById(@PathVariable("restaurant_id") String id) {
    id = id.trim();
    Entity restaurant;
    try {
      restaurant = restaurantService.findById(id);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseEntity<Entity>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return restaurant != null ? new ResponseEntity<Entity>(restaurant, HttpStatus.OK) : new ResponseEntity<Entity>(HttpStatus.NO_CONTENT);
  }

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<Restaurant> add(@RequestBody RestaurantVO restaurantVO) {
    Restaurant restaurant = new Restaurant(null, null, null, null);
    BeanUtils.copyProperties(restaurantVO, restaurant);
    try {
      restaurantService.add(restaurant);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseEntity<Restaurant>(HttpStatus.UNPROCESSABLE_ENTITY);
    }
    return new ResponseEntity<Restaurant>(HttpStatus.CREATED);
  }
}
