import java.util.Comparator;

public class SortById implements Comparator<StudentDemo> {

	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {

		return o1.id - o2.id;
	}

}
