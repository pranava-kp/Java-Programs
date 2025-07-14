import java.util.*;
class stud
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stud student = (stud) o;
        return usn.equals(student.usn);
    }

    @Override
    public int hashCode() {
        return usn.hashCode();
    }
}

public class May12_01 {

	public static void main(String[] args) {
		HashMap<stud,Integer> si = new HashMap<>();
		si.put(new stud("a","1",1), 1);
		si.put(new stud("a","1",1), 1);
		System.out.println(si);
		
	}

}