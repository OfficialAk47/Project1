
public class StudentDemo {
	int id;
	String name;
	double marks;
	int age;

	public StudentDemo(int id, String name, int age, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
}
