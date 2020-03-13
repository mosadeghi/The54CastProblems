
public class KhayamRec {
	public static void main(String[] args) {
		printTriangle(5);
	}
	
	static int khayam(int n,int m) {
		if(m == 0 || m==n) {
			return 1;
		}
		else {
			return khayam(n-1,m-1)+khayam(n-1,m);
		}
	}
	
	static void printTriangle(int n) {
		for (int line=0;line<=n;line++) {
			for(int member=0;member<=line;member++) {
				System.out.print(khayam(line,member)+" ");
			}
			System.out.println();
		}
	}
}
