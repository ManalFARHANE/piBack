package com.social.controller;

import com.social.entities.User;
import com.social.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
//@RequestMapping("account")
public class AccountController {

	public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private UserService userService;





	// request method to create a new account by a guest
	/*@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		if (userService.find(newUser.getUsername()) != null) {
			logger.error("username Already exist " + newUser.getUsername());
			return new ResponseEntity(
					new CustomErrorType("user with username " + newUser.getUsername() + "already exist "),
					HttpStatus.CONFLICT);
		}
		newUser.setRole("USER");

		return new ResponseEntity<User>(userService.save(newUser), HttpStatus.CREATED);
	}*/

	// this is the login api/service

	@CrossOrigin()
	@PostMapping("/users")
	public User save(@RequestBody User user){ return userService.save(user);}

	@CrossOrigin
	@RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged " + principal);
		return principal;
	}

	@CrossOrigin
	@GetMapping("/")
	public String log() {
		return "authenticated";
	}


	@CrossOrigin
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> GetAllUser() {
		return userService.GetAllUser();
	}

	@CrossOrigin()
	@GetMapping("/users/{username}")
	public User find(@PathVariable String username) {
	return userService.find(username);
}

	@CrossOrigin()
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable long id) {
		return userService.findUserById(id);
	}

	@CrossOrigin()
	@PutMapping (value = "/users/{username}")
	public User update(@PathVariable(name = "username") String username, @RequestBody User user){
		user.getUsername();
		return userService.update(username, user);
	}






}
//npm install axios
