
public class Student extends Person {
	String type = "学生";

	@Override
	public void introduce() {
		System.out.println("私は学生です");
	}

	public void compareIntroductions() {
		this.introduce();
		super.introduce();
	}
}
