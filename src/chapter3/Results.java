package chapter3;

public class Results {

	private int data[];
	public Results(int size){
		data= new int[size];
	}
	public void setData(int position,int value){
		data[position] = value;
	}
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
}
