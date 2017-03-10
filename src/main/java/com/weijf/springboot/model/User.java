/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.model
 *
 *    Filename:    User.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月9日 下午10:20:22
 *
 *    Revision:
 *
 *    2017年3月9日 下午10:20:22
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.model;

public class User {

	private int id;
	private String name;
	private String pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
