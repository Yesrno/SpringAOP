package Dao;

import java.util.Scanner;

public class Person implements TestDao {
	
	private String id;
	private String name;
	private String birth;
	private Acount acount;

	@Override
	public void service() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		while(true) {
			System.out.print("1--数学");System.out.println("2--语文");
			System.out.print("3--英语");System.out.println("4--物理");
			System.out.print("5--化学");System.out.println("6--生物");
			System.out.print("7--历史");System.out.println("8--政治");
			System.out.print("9--地理");System.out.println("0--退出");
			System.out.print("选择你要购买的课程： ");
			int n=reader.nextInt();
			switch(n) {
				case 1:
					System.out.println("数学价格：66.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m=reader.nextInt();
					switch(m) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>66.9) {
								double ban=Double.parseDouble(acount.getBanlance())-66.9;
								acount.setBanlance(String.valueOf(ban));
								System.out.println("购买成功！剩余账户积分："+ban);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 2:
					System.out.println("语文价格：36.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m1=reader.nextInt();
					switch(m1) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>36.9) {
								double ban8=Double.parseDouble(acount.getBanlance())-36.9;
								acount.setBanlance(String.valueOf(ban8));
								System.out.println("购买成功！剩余账户积分："+ban8);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 3:
					System.out.println("英语价格：166.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m2=reader.nextInt();
					switch(m2) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>166.9) {
								double ban7=Double.parseDouble(acount.getBanlance())-166.9;
								acount.setBanlance(String.valueOf(ban7));
								System.out.println("购买成功！剩余账户积分："+ban7);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 4:
					System.out.println("物理价格：266.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m3=reader.nextInt();
					switch(m3) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>266.9) {
								double ban6=Double.parseDouble(acount.getBanlance())-266.9;
								acount.setBanlance(String.valueOf(ban6));
								System.out.println("购买成功！剩余账户积分："+ban6);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 5:
					System.out.println("化学价格：206.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m4=reader.nextInt();
					switch(m4) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>206.9) {
								double ban5=Double.parseDouble(acount.getBanlance())-206.9;
								acount.setBanlance(String.valueOf(ban5));
								System.out.println("购买成功！剩余账户积分："+ban5);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 6:
					System.out.println("生物价格：186.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m5=reader.nextInt();
					switch(m5) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>186.9) {
								double ban4=Double.parseDouble(acount.getBanlance())-186.9;
								acount.setBanlance(String.valueOf(ban4));
								System.out.println("购买成功！剩余账户积分："+ban4);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 7:
					System.out.println("历史价格：96.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m6=reader.nextInt();
					switch(m6) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>96.9) {
								double ban3=Double.parseDouble(acount.getBanlance())-96.9;
								acount.setBanlance(String.valueOf(ban3));
								System.out.println("购买成功！剩余账户积分："+ban3);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 8:
					System.out.println("政治价格：76.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m7=reader.nextInt();
					switch(m7) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>76.9) {
								double ban2=Double.parseDouble(acount.getBanlance())-76.9;
								acount.setBanlance(String.valueOf(ban2));
								System.out.println("购买成功！剩余账户积分："+ban2);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 9:
					System.out.println("地理价格：46.9");
					System.out.print("是否购买？（1--是，，0--否）");
					int m8=reader.nextInt();
					switch(m8) {
						case 0:
							System.out.println("欢迎下次光临！");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>46.9) {
								double ban1=Double.parseDouble(acount.getBanlance())-46.9;
								acount.setBanlance(String.valueOf(ban1));
								System.out.println("购买成功！剩余账户积分："+ban1);
							}
							else {
								System.out.println("不好意思！积分不够，需要充值！");
							}
							break;
					}
					break;
				case 0:
					System.out.println("欢迎下次光临！");
					break;
			}
			if(n==0) {
				break;
			}
		}
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {return id;}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {return name;}
	public void setBirth(String id) {
		this.birth=id;
	}
	public String getBirth() {return birth;}
	public void setAcount(Acount id) {
		this.acount=id;
	}
	public Acount getAcount() {return acount;}
}
