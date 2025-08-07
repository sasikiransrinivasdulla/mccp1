import java.util.*;
class SortByCgpaAsc implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.cgpa == s2.cgpa) return 0;
		else if (s1.cgpa > s2.cgpa) return 1;
		else return -1;
	}
}

class Main21{
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
		Collections.sort(Sl, new SortByCgpaAsc());
		System.out.println("=== 1st and Last ranks according to CGPA ===");
		System.out.println(Sl.get(0).rollno + " " + Sl.get(0).sname + " " + Sl.get(0).branch + " " + Sl.get(0).total_marks + " " + Sl.get(0).cgpa);
		System.out.println(Sl.get((Sl.size())-1).rollno + " " + Sl.get((Sl.size())-1).sname + " " + Sl.get((Sl.size())-1).branch + " " + Sl.get((Sl.size())-1).total_marks + " " + Sl.get((Sl.size())-1).cgpa);
	}
}
