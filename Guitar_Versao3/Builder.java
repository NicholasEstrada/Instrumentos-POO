package Guitar_Versao3;

public enum Builder {
	 FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	 public String toString(){
	 switch(this) {
	 case FENDER: return "fender";
	 case MARTIN: return "martin";
	 case GIBSON: return "gibson";
	 case COLLINGS: return "ecollings";
	 case OLSON: return "olson";
	 case RYAN: return "ryan";
	 case PRS: return "prs";
	 case ANY: return "any";
	public enum Type {
	 ACOUSTIC, ELETRIC;
	 public String toString(){
	 switch(this) {
	 case ACOUSTIC: return "acoustic";
	 case ELETRIC: return "eletric";
	 }
	 return null;
	 }