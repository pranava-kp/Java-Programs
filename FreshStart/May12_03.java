import java.util.*;

class stud implements Comparable
{
	public String nm,usn;
	public int m;
	
	public stud(String n, String u, int m)
	{ nm=n; usn=u; this.m=m; }
	
	@Override
	public String toString()
	{
		return nm+" "+usn+" "+m;
	}
	
	@Override
    public boolean equals(Object o) {
		System.out.println("Equals called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stud student = (stud) o;
        return usn.equals(student.usn);
    }

    @Override
    public int hashCode() {
		System.out.println("HashCode called");
        return usn.hashCode();
    }
	
}

class stud_comp implements Comparator<stud>
{
	@Override
	public int compare(stud a, stud b) {	
		System.out.println("Compare called");	
		return a.usn.compareTo(b.usn);	
		
	}
	
}

public class May12_03 {

	public static void main(String[] args) {
		TreeMap<stud,Integer> si = new TreeMap<>();
		si.put(new stud("a","20",1), 1);
		si.put(new stud("a","1",1), 1);
		
		System.out.println(si);
	}

}