package com.bt.xlt.homework0305;

public class Xiaoma {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		Xiaoma xm = new Xiaoma();

		try {
			xm.Show(x, y, z);
		} catch (RecomException e) {

			System.out.println(e.getMessage());

		}
	}

	private  void Show(int a ,int b,int c) throws RecomException {

		if (a<=0||b<=0||c<=0) {
			 throw new RecomException("请输入正整数：");
		}

		if ((a+b)>c&&(a+c)>b&&(b+c)>a) {
			System.out.println("这是一个三角形");
		}else{
			System.out.println("这不是一个三角形");
		}
	}
}
