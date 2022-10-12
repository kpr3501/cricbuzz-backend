package com.cricbuzz.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CricbuzzEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Date dob;
	private String birthPlace;
	private String nickname;
	private Integer height;
	private String role;
	private String battingStyle;
	private String bowlingStyle;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	public CricbuzzEntity(Integer id, String name, Date dob, String birthPlace, String nickname, Integer height,
			String role, String battingStyle, String bowlingStyle) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.birthPlace = birthPlace;
		this.nickname = nickname;
		this.height = height;
		this.role = role;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}
	public CricbuzzEntity() {
		
	}
}
