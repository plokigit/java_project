package com.ict01.grammer04;
class Ex01{
	public static void main(String[] args){
	
	//char k1�� A�� ������ī, B�̸� ����� C=ĳ���� ������ �ѱ�
	char k1 = 'D';
	String str = "";

	switch(k1){
		case 'A' : str = "������ī"; break;
		case 'B' : str = "�����"; break;
		case 'C' : str = "ĳ����"; break;
		default : str = "�ѱ�";
		}
	System.out.println("��� : "+str);

	//char k1�� A=������ī, b=����� C=ĳ���� ������ �ѱ�(��ҹ��� ���ļ�)
	
	k1 = 'C';
	switch(k1){
		case 'A' :
		case 'a' : str = "������ī"; break;
		case 'B' : 
		case 'b' : str = "�����"; break;
		case 'C' : 
		case 'c' : str = "ĳ����"; break;
		default : str = "�ѱ�";
		}
	System.out.println("��� : "+str);
	

	// k2 = 1,3�̸� �� 2,4�� ����
	int k2 = 3;
	String str2 ="";
	switch(k2){
		case 1 :  
		case 3 : str2 = "��"; break;
		case 2 : 
		case 4 : str2 = "��"; break;
		}
	System.out.println("��� : "+str2);

	// k3 �ѱ��̸� ����, �߱��̸� ����¡, �Ϻ� = ����
	String k3 = "�ѱ�";
	String str3 = "";
	switch(k3){
		case "�ѱ�" : str3 = "����"; break;
		case "�߱�" : str3 = "����¡"; break;
		case "�Ϻ�" : str3 = "����"; break;
		default : str3 = "�����Ϳ� ���� ������"; break;
		}
	System.out.println("��� : "+str3);

	}

}