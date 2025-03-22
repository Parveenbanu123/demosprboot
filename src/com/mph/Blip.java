package com.mph;

public class Blip {
	protected int blipvert(int x) {
		return 0;
	}
}
class Vert extends Blip{
//	public int blipvert(int x) {//No Issues
//		return 0;
//	}
	
//	private int blipvert(int x) {//protected>private
//		return 0;// Error:Cannot reduce the visibility
//	}
	
//	private int blipvert(long x) {//Warning
//		return 0;
//	}
	
//	protected long blipvert(int x) {
//		return 0;//Error:Return type is incompatible
//	}
	
//	protected int blipvert(long x) {// No Issues
//		return 0;
//	}
	
//	protected long blipvert(long x) {//No Issues
//		return 0;
//	}
	
	protected long blipvert(int x,int y) {//No Issues
		return 0;
	}
}
