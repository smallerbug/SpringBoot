/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.restcontroller
 *
 *    Filename:    UserController.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月9日 下午10:22:47
 *
 *    Revision:
 *
 *    2017年3月9日 下午10:22:47
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.restcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weijf.springboot.model.User;

/**
 * @ClassName UserController
 * @Description TODO(这里用一句话描述这个类的作用)
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUserByid(@PathVariable("id") int id) {
		User u = new User();
		u.setId(id);
		u.setName("weijf");
		System.out.println("----");
		return u;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUser(User user) {
		System.out.println(user.getId() + user.getName() + user.getPass());
		User u = new User();
		u.setId(15);
		u.setName("weijf");
		System.out.println("----");
		return u;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public User deleteUserByid(@PathVariable("id") int id) {
		User u = new User();
		u.setId(id);
		u.setName("wei");
		System.out.println("--1--");
		return u;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public User setUserByid(@PathVariable("id") int id, User user) {
		System.out.println(id + "======" + user.getId() + user.getName() + user.getPass());
		User u = new User();
		u.setId(17);
		u.setName("weijf233");
		System.out.println("--put--");
		return u;
	}

}
