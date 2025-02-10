import java.util.*;

public class Main {
	
	// Function to implement optimal page replacement algorithm
	public static void optimalPage(int[] pg, int pn, int fn) {
		
		// Create an array for given number of frames and initialize it as empty.
		int[] fr = new int[fn];
		Arrays.fill(fr, -1); // set all elements of fr to -1
		
		// Traverse through page reference array and check for miss and hit.
		int hit = 0;
		for (int i = 0; i < pn; i++) {
			
			// Page found in a frame: HIT
			boolean found = false;
			for (int j = 0; j < fn; j++) {
				if (fr[j] == pg[i]) {
					hit++;
					found = true;
					break;
				}
			}
			if (found)
				continue;
			
			// Page not found in a frame: MISS
			
			// If there is space available in frames.
			boolean emptyFrame = false;
			for (int j = 0; j < fn; j++) {
				if (fr[j] == -1) {
					fr[j] = pg[i];
					emptyFrame = true;
					break;
				}
			}
			if (emptyFrame)
				continue;
			
			// Find the page to be replaced.
			int farthest = -1, replaceIndex = -1;
			for (int j = 0; j < fn; j++) {
				int k;
				for (k = i + 1; k < pn; k++) {
					if (fr[j] == pg[k]) {
						if (k > farthest) {
							farthest = k;
							replaceIndex = j;
						}
						break;
					}
				}
				if (k == pn) {
					replaceIndex = j;
					break;
				}
			}
			fr[replaceIndex] = pg[i];
		}
		
		System.out.println("No. of hits = " + hit);
		System.out.println("No. of misses = " + (pn - hit));
	}
	
	// Driver code
	public static void main(String[] args) {
		int[] pg = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1};
		int pn = pg.length;
		int fn = 4;
		optimalPage(pg, pn, fn);
	}
}
