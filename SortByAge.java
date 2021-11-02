import java.util.Comparator;

public class SortByAge implements Comparator<StudentDemo> {

	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {

		return o1.age - o2.age;
	}

}
