package konsola;

public class MyLine {

	public static void placeRight(String content) {
		int max = 72;
		int length = content.length();
		int spaceLength = max - length;
		String space = "";
		for (int i = 0; i < spaceLength; i++) {
			space += " ";
		}
		System.out.println(space + content);
	}

	public static void placeCenter(String content) {

		int spaceLength = (72 - content.length()) / 2;
		String space = "";
		for (int i = 0; i < spaceLength; i++) {
			space += " ";
		}
		System.out.println(space + content + space);
	}

	public static void placeLeft(String content) {
		System.out.println(content);
	}

	public static void placeTwoCorners(String leftContent, String rightContent) {
		int spaceLength = 72 - leftContent.length() - rightContent.length();
		String space = "";
		for (int i = 0; i < spaceLength; i++) {
			space += " ";
		}
		System.out.println(leftContent + space + rightContent);
	}
	
	public static String placeCenter(String content, int length) {

		int spaceLength = (length - content.length()) / 2;
		String space = "";
		for (int i = 0; i < spaceLength; i++) {
			space += " ";
		}
		return (space + content + space);
	}

}
