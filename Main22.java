import java.util.*;

class Main22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student sl[] = new Student[n];
		for(int i=0; i<n; i++){
			int rno = sc.nextInt();
			String sn = sc.next();
			String br = sc.next();
			int tm = sc.nextInt();
			double cg = sc.nextDouble();
			sl[i] = new Student(rno, sn, br, tm, cg);
		}
		for(Student s : sl){
			System.out.println(s.rollno + " " + s.sname + " " + s.branch + " " + s.total_marks + " " + s.cgpa);
			}
		Arrays.sort(sl, new SortByCgpaAsc());
		System.out.println("=== 1st and Last ranks according to CGPA ===");
		System.out.println(sl[0].rollno + " " + sl[0].sname + " " + sl[0].branch + " " + sl[0].total_marks + " " + sl[0].cgpa);
		System.out.println(sl[sl.length - 1].rollno + " " + sl[sl.length - 1].sname + " " + sl[sl.length - 1].branch + " " + sl[sl.length - 1].total_marks + " " + sl[sl.length - 1].cgpa);
	}
}

