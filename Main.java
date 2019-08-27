
public class Main {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"123","456","789"};
//		String[] phone_book = {"12","123","1235","567","88"};
		
		System.out.println(new Solution().solution(phone_book));
	}

}

class Solution {
    public boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
        	for (int j = i+1; j < phone_book.length; j++) {
        		String s1, s2;
        		s1 = phone_book[i].length() < phone_book[j].length() ? phone_book[i] : phone_book[j];
        		s2 = phone_book[i].length() < phone_book[j].length() ? phone_book[j] : phone_book[i];
        		if (s2.substring(0, s1.length()).equals(s1)) {
        			return false;
        		}
        		
/**				startWith을 이용한 다른 풀이
//        		if (phone_book[i].startsWith(phone_book[j])) return false;
//        		if (phone_book[j].startsWith(phone_book[i])) return false;
 * */
        	}
        }
        return true;
    }
}