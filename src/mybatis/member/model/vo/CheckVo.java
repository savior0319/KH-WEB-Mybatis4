package mybatis.member.model.vo;

public class CheckVo {

	private String name, addr, gender, hobby;

	public CheckVo() {
	}

	public CheckVo(String name, String addr, String gender, String hobby) {
		super();
		this.name = name;
		this.addr = addr;
		this.gender = gender;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "CheckVo [name=" + name + ", addr=" + addr + ", gender=" + gender + ", hobby=" + hobby + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
