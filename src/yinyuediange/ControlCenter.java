package yinyuediange;

import java.util.Scanner;

public class ControlCenter {

	public static void main(String[] args) {
		System.out.println("���������ж����׸�?");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.println("������ÿ�׸�Ļ�����Ϣ��");
		 MusicInfo[] music=new MusicInfo[n];
		 for(int i=0;i<n;i++) {
			 String MusicName=in.next();
			 //�˴������ʹ��in.next(),��������in.nextLine();
			 String Singer=in.next();
			 float time=in.nextFloat();
			 //��Ϊin�Ƕ�������Ҫ��Ӽ��̵õ��������ݾ͵ô�������in����
		 music[i]=new MusicInfo(MusicName, Singer, time);
		 }
		 System.out.println("�ܹ������� "+n+"�׸����Ϣ��");
		 
		 System.out.println("������Ҫ��ڼ��׸裿");
		 int i=in.nextInt();
		
		 User u=new User();
		 u.diange(music[i-1]);
		 System.out.println("---------------");
		 Host h=new Host();
		 h.playMusic(music);
		 System.out.println("---------------");
		 
		 System.out.println("׼��ָ�����ŵڼ��׸裿");
		 int x=in.nextInt();
		
		 h.SpecifyThePlay(music, x-1);
		 in.close();
	}

}
