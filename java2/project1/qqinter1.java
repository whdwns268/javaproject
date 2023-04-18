package project1;

public interface qqinter1 {
	int qqnum[]= {1,2,3,4,5,6,7,8,9,10};
	
	default int qqea(){
		int ea = this.qqnum.length;
		System.out.println(ea);
		return ea;
	}
}
