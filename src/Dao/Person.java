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
			System.out.print("1--��ѧ");System.out.println("2--����");
			System.out.print("3--Ӣ��");System.out.println("4--����");
			System.out.print("5--��ѧ");System.out.println("6--����");
			System.out.print("7--��ʷ");System.out.println("8--����");
			System.out.print("9--����");System.out.println("0--�˳�");
			System.out.print("ѡ����Ҫ����Ŀγ̣� ");
			int n=reader.nextInt();
			switch(n) {
				case 1:
					System.out.println("��ѧ�۸�66.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m=reader.nextInt();
					switch(m) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>66.9) {
								double ban=Double.parseDouble(acount.getBanlance())-66.9;
								acount.setBanlance(String.valueOf(ban));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 2:
					System.out.println("���ļ۸�36.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m1=reader.nextInt();
					switch(m1) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>36.9) {
								double ban8=Double.parseDouble(acount.getBanlance())-36.9;
								acount.setBanlance(String.valueOf(ban8));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban8);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 3:
					System.out.println("Ӣ��۸�166.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m2=reader.nextInt();
					switch(m2) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>166.9) {
								double ban7=Double.parseDouble(acount.getBanlance())-166.9;
								acount.setBanlance(String.valueOf(ban7));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban7);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 4:
					System.out.println("����۸�266.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m3=reader.nextInt();
					switch(m3) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>266.9) {
								double ban6=Double.parseDouble(acount.getBanlance())-266.9;
								acount.setBanlance(String.valueOf(ban6));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban6);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 5:
					System.out.println("��ѧ�۸�206.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m4=reader.nextInt();
					switch(m4) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>206.9) {
								double ban5=Double.parseDouble(acount.getBanlance())-206.9;
								acount.setBanlance(String.valueOf(ban5));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban5);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 6:
					System.out.println("����۸�186.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m5=reader.nextInt();
					switch(m5) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>186.9) {
								double ban4=Double.parseDouble(acount.getBanlance())-186.9;
								acount.setBanlance(String.valueOf(ban4));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban4);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 7:
					System.out.println("��ʷ�۸�96.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m6=reader.nextInt();
					switch(m6) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>96.9) {
								double ban3=Double.parseDouble(acount.getBanlance())-96.9;
								acount.setBanlance(String.valueOf(ban3));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban3);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 8:
					System.out.println("���μ۸�76.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m7=reader.nextInt();
					switch(m7) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>76.9) {
								double ban2=Double.parseDouble(acount.getBanlance())-76.9;
								acount.setBanlance(String.valueOf(ban2));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban2);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 9:
					System.out.println("����۸�46.9");
					System.out.print("�Ƿ��򣿣�1--�ǣ���0--��");
					int m8=reader.nextInt();
					switch(m8) {
						case 0:
							System.out.println("��ӭ�´ι��٣�");
							break;
						case 1:
							if(Double.parseDouble(acount.getBanlance())>46.9) {
								double ban1=Double.parseDouble(acount.getBanlance())-46.9;
								acount.setBanlance(String.valueOf(ban1));
								System.out.println("����ɹ���ʣ���˻����֣�"+ban1);
							}
							else {
								System.out.println("������˼�����ֲ�������Ҫ��ֵ��");
							}
							break;
					}
					break;
				case 0:
					System.out.println("��ӭ�´ι��٣�");
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
