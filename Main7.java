import java.util.*;
class SortByMarksAsc implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.total_marks == s2.total_marks) return 0;
		else if (s1.total_marks > s2.total_marks) return 1;
		else return -1;
	}
}

class Main7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Student> Sl = new ArrayList<>();
		for(int i=0; i<n; i++){
			int rno = sc.nextInt();
			String sn = sc.next();
			String br = sc.next();
			int tm = sc.nextInt();
			double cg = sc.nextDouble();
			Student s1 = new Student(rno, sn, br, tm, cg);
			Sl.add(s1);
		}
		for(Student s : Sl){
			System.out.println(s.rollno + " " + s.sname + " " + s.branch + " " + s.total_marks + " " + s.cgpa);
			}
		Collections.sort(Sl, new SortByMarksAsc());
		System.out.println("=== After Soring Marks ASC ===");
		for(Student s : Sl){
			System.out.println(s.rollno + " " + s.sname + " " + s.branch + " " + s.total_marks + " " + s.cgpa);
			}
	}
}
