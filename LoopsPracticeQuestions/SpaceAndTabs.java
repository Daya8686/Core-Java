package LoopsPracticeQuestions;

public class SpaceAndTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="This	is a	 program";
		int count=0;
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(c==' '||c=='\t') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
