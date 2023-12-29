package generic;

import java.util.ArrayList;

public class MyArrayList<E> {
	private Object[] elementData;
	private int size;
	public MyArrayList() {
		elementData=new Object[0];
		//object 배열의 경우 기본형은 못 들어감, Object의 자식만 가능
		size=elementData.length;
	}
	public int size() {
		return size;
	}
	public void add(E element) {
		Object[] tempElementData=new Object[elementData.length+1];
		for (int i=0;i<elementData.length;i++) {
			tempElementData[i]=elementData[i];
		}
		tempElementData[tempElementData.length-1]=element;
		this.elementData=tempElementData;
		this.size=this.elementData.length;
		
	}
	public E get(int index) {
		if(index< 0 ||index >= this.elementData.length) {
			throw new ArrayIndexOutOfBoundsException("뭐미~~~");
		}
		return (E)this.elementData[index];
	}
	
	
}
