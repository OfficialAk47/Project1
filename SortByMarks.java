import java.util.Comparator;

public class SortByMarks implements Comparator<StudentDemo> {

	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {
		int difference = (int) (o1.marks - o2.marks);
		return difference;
	}

}
