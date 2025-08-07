import java.util.*;

class SortByRollnoAsc implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.rollno == s2.rollno) return 0;
		else if (s1.rollno > s2.rollno) return 1;
		else return -1;
	}
}

class Main11{
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
		Arrays.sort(sl, new SortByRollnoAsc());
		System.out.println("=== After Soring Rollno in ASC ===");
		for(Student s : sl){
			System.out.println(s.rollno + " " + s.sname + " " + s.branch + " " + s.total_marks + " " + s.cgpa);
			}
	}
}

