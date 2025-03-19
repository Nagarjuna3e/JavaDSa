package strings;

public class Anagram {

	public static void main(String[] args) {
		String str1="earth";
		String str2="heart";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		str1=SortingOfString.sortString(str1);
		str2=SortingOfString.sortString(str2);
		
		if(str1.equals(str2)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}

	}

}
