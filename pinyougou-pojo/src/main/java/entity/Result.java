package entity;

import java.io.Serializable;

public class Result implements Serializable{
	private boolean success;//判断是否成功
	private String massage;//响应信息

	public Result(boolean success, String massage) {
		super();
		this.success = success;
		this.massage = massage;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

}
