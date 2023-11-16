package JavaLangPackages;

enum elements{
	H("Hydrogen"),He("Helium"),Li("Lithiam"),Be("Berilium"),B("Boran"),C("Carbon"),N("Nitrogen"),O("Oxygen"),F("Florin");
	private String Elementnames;
	elements(String Elementnames) {
		// TODO Auto-generated constructor stub
		this.Elementnames=Elementnames;
	}
	
	public String getElementName() {
		return Elementnames;
	}
}

public class EnumForElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elements e=elements.B;
		System.out.println(e.getElementName());
		elements list[]=elements.values();
		
		for(elements l:list) {
			System.out.println("Elements name: "+l.getElementName()+" Elements Symbols:"+l);
			
		}

	}

}
