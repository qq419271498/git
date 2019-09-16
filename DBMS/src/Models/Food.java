package Models;

public class Food {
	 private int foodId;
	 private String foodName;
	 private String salt;
	 private String vinegar;
	 private String beef ;
	
	 public  Food(){
		  this.foodId = 0;
		  this.foodName = "";
		  this.salt = "";
		  this.vinegar = "";
		  this.beef ="";
	 }
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getSalt() {
	        return salt;
	}
	public void setSalt(String salt) {
	    this.salt = salt;
	}
	public String getVinegar() {
	        return vinegar;
	}
	public void setVinegar(String vinegar) {
	    this.vinegar = vinegar;
	}
	public String getBeef() {
	    	return beef;
	}
	public void setBeef(String beef) {
		this.beef = beef;
	}
	
}
