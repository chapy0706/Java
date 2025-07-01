package vehicle_model;

public class Vehicle {
	// 問題1；String型のprivateなインスタンスフィールド「owner」の作成
	private String owner;
	
	//　問題3：VehicleクラスにownerのgetOwnerとsetOwnerのセット
	public String getOwner() {
		return this.owner; // getOwner
	}
		
	public void setOwner(String owner) {
		this.owner = owner; // setOwner
	}
	
}
