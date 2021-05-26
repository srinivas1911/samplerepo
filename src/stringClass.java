
public class stringClass {
	
	public void split1() {
		String s = "srini@1911";
		String[] sa = s.split("@");
		for(String st : sa) {
			System.out.println(st);
	}
	}
	
	public void split2() {
		String s = "srini-1911";
		String st[] = s.split("-");
		for(String sr : st) {
			System.out.print(sr);
		}
	}
	
	public void replace1() {
		String s = "Srinivas";
		String t = s.replace("i", " ");
		System.out.println(t);
	}
	
	public void replace2() {
		String s = "January2021";
		String r = s.replaceAll("[^0-9]", "");
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		stringClass cl = new stringClass();
		cl.split1();
		cl.split2();
		cl.replace1();
		cl.replace2();
		}

}
