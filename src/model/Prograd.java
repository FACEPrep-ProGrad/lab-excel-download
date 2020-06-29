package model;

/*
//Progression -1 
//Create a class called ProGrad with the following parameters
//
//	private String name;
//	private String id;
//	private String rate;
//	private String comment;
//	private String recommend;
//	
//Generate getters and setters.
//Generate a constructor with the following parameters (String name, String id, String rate, String comment, String recommend)

*/
public class Prograd{
	private String name;
	private String id;
	private String rate;
	private String comment;
	private String recommend;
	
	public Prograd(String name, String id, String rate, String comment, String recommend) {
		
		this.name = name;
		this.id = id;
		this.rate = rate;
		this.comment = comment;
		this.recommend = recommend;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the recommend
	 */
	public String getRecommend() {
		return recommend;
	}

	/**
	 * @param recommend the recommend to set
	 */
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	
}