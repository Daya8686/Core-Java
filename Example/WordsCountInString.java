package Example;

public class WordsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String str="   This is   a Example   program";
		str=str.replaceAll("\\s+", " ").trim();
		String words[]=str.split("\\s");
		System.out.println(words.length);
	}

}
