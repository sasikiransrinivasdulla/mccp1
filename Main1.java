import java.util.*;
class Student{
	int rollno;
	String sname;
	String branch;
	int total_marks;
	double cgpa;
	public Student(int rn, String sn, String br, int tm, double cg) {
		rollno = rn;
		sname = sn;
		branch = br;
		total_marks = tm;
		cgpa = cg;
	}
}
class SortByRollnoAsc implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.rollno == s2.rollno) return 0;
		else if (s1.rollno > s2.rollno) return 1;
		else return -1;
	}
}

class Main1{
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
		Collections.sort(Sl, new SortByRollnoAsc());
		System.out.println("=== After Soring Rollno in ASC ===");
		for(Student s : Sl){
			System.out.println(s.rollno + " " + s.sname + " " + s.branch + " " + s.total_marks + " " + s.cgpa);
			}
	}
}

