import java.util.LinkedHashMap;
import java.util.Map;

class Cookies<K, V> extends LinkedHashMap<K, V> {
    private final int maxEntries;

    public Cookies(int maxEntries) {
        super(maxEntries + 1, 0.75f, true); // access-order enabled
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    	System.out.println("in remove...()");
        return size() > maxEntries;
    }
    
}

class May14_02 {
	public static void main(String [] args)
	{
		Cookies <String, String> c = new Cookies<>(2);
		c.put("10:10", "A");
		c.put("10:11", "B");
		System.out.println(c);
		c.put("10:12", "C");
		System.out.println(c);
		c.put("10:13", "D"); // Entry 1 will be removed (eldest)
	
		System.out.println(c); 
	}
}