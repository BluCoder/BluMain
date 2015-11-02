package fallSemesterPackage.Chapter_7;

public class Project707 {

	public static void main(String[] args) {
		int l, w, a, p, lLength, pLength;
		String string;
		String wString;
		String aString;
		
		System.out.println("Width  -  Length | Area  -  Perimeter");
		
		for (w = 1; w <= 10; w++){
			for (l = 1; l <= 10; l++){
				a = l * w;
				p = 2 * (l + w);
				
				string = l + "";
				lLength = string.length();
				wString = w + "";

				while (wString.length() < 7){
					wString += " ";
				}
				
				wString += "-";
				
				while (wString.length() < 16 - lLength){
					wString += " ";
				}
				
				System.out.print(wString + l + " | ");
				
				aString = a + "";
				string = p + "";
				pLength = string.length();
				
				while (aString.length() < 6){
					aString += " ";
				}
				
				aString += "-";
				
				while (aString.length() < 18 - pLength){
					aString += " ";
				}
				
				System.out.println(aString + p);
				
//				System.out.println("Done.");
			}
			
//			System.out.println("Done.");
		}
		
//		System.out.println("Done.");
	}

}
