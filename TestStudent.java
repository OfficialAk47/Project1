import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) throws InvalidInputException {
		HashSet<StudentDemo> hset = new HashSet<StudentDemo>();
		hset.add(new StudentDemo(011, "Akash Modi", 543, 26));
		hset.add(new StudentDemo(022, "Arun", 500, 25));
		hset.add(new StudentDemo(033, "I Rana", 444, 23));
		hset.add(new StudentDemo(044, "kaamini", 499, 26));
		hset.add(new StudentDemo(055, "Kaamra", 379, 30));
		hset.add(new StudentDemo(055, "Kaamra", 379, 30));

		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------WelCome-------------");

		ArrayList<StudentDemo> arrayList = new ArrayList<StudentDemo>(hset);
		System.out.println("The Student List:---------");
		System.out.println(arrayList);

		System.out.println("Press 1 To Sort By ID:-");
		System.out.println("Press 2 To Sort By Name:-");
		System.out.println("Press 3 To Sort By Marks:-");
		System.out.println("Press 4 To Sort By Age:-");
		System.out.println("Press 5 To Exit.");

		int option = scanner.nextInt();

		switch (option) {
		case 1:
			Collections.sort(arrayList, new SortById());
			for (StudentDemo studentDemo : arrayList) {
				System.out.println(studentDemo);
			}
			break;
		case 2:
			Collections.sort(arrayList, new SortByName());
			for (StudentDemo studentDemo : arrayList) {
				System.out.println(studentDemo);
			}
			break;
		case 3:
			Collections.sort(arrayList, new SortByMarks());
			for (StudentDemo studentDemo : arrayList) {
				System.out.println(studentDemo);
			}
			break;
		case 4:
			Collections.sort(arrayList, new SortByAge());
			for (StudentDemo studentDemo : arrayList) {
				System.out.println(studentDemo);
			}
			break;
		case 5:
			System.exit(0);
			break;
			
			default:
				throw new InvalidInputException("INVALID INPUT.");
		}
		scanner.close();
	}
}