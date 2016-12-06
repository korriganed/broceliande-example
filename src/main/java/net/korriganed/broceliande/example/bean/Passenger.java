package net.korriganed.broceliande.example.bean;

import net.korriganed.broceliande.data.Feature;
import net.korriganed.broceliande.data.FeatureType;
import net.korriganed.broceliande.data.Target;
import net.korriganed.broceliande.data.TargetType;

public class Passenger {

	private Integer passengerId;
	private Integer survived;
	private Integer pclass;
	private String name;
	private String sex;
	private Integer age;
	private Integer sibSp;
	private Integer parch;
	private String ticket;
	private Double fare;
	private String cabin;
	private String embarked;

	private String title;

	@Feature(FeatureType.CATEGORICAL)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	@Target(TargetType.DISCRETE)
	public Integer getSurvived() {
		return survived;
	}

	public void setSurvived(Integer survived) {
		this.survived = survived;
	}

	@Feature(FeatureType.ORDERED)
	public Integer getPclass() {
		return pclass;
	}

	public void setPclass(Integer pclass) {
		this.pclass = pclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Feature(FeatureType.CATEGORICAL)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Feature(FeatureType.ORDERED)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Feature(FeatureType.ORDERED)
	public Integer getSibSp() {
		return sibSp;
	}

	public void setSibSp(Integer sibSp) {
		this.sibSp = sibSp;
	}

	@Feature(FeatureType.ORDERED)
	public Integer getParch() {
		return parch;
	}

	public void setParch(Integer parch) {
		this.parch = parch;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Feature(FeatureType.ORDERED)
	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	@Feature(FeatureType.CATEGORICAL)
	public String getEmbarked() {
		return embarked;
	}

	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}

}
