import java.util.*;

class Main20{
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
		Arrays.sort(sl, new SortByCgpaDesc());
		System.out.println("=== After Sorting CGPA in DE
		SC ===");
		for(Student s : sl){
			System.out.println(s.rollno + " " + s.sname + " " + s.branch + " " + s.total_marks + " " + s.cgpa);
			}
	}
}

