package project1;
/*
public interface updown {
	int number = (int)Math.ceil(Math.random()*10);
	public int qqea(String gamepoint);
}*/


public interface updown {
	//pc가 0~10 중 랜덤하나 뽑음
	int number = (int)Math.ceil(Math.random()*10);
	public void user();
	public String restult(int pc, int user);
}