package yinyuediange;

import java.util.Scanner;

public class ControlCenter {

	public static void main(String[] args) {
		System.out.println("你想歌库中有多少首歌?");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.println("请输入每首歌的基本信息：");
		 MusicInfo[] music=new MusicInfo[n];
		 for(int i=0;i<n;i++) {
			 String MusicName=in.next();
			 //此处最好是使用in.next(),而不是用in.nextLine();
			 String Singer=in.next();
			 float time=in.nextFloat();
			 //因为in是对象，所以要想从键盘得到几个数据就得创建几个in对象。
		 music[i]=new MusicInfo(MusicName, Singer, time);
		 }
		 System.out.println("总共生成了 "+n+"首歌的信息。");
		 
		 System.out.println("请问你要点第几首歌？");
		 int i=in.nextInt();
		
		 User u=new User();
		 u.diange(music[i-1]);
		 System.out.println("---------------");
		 Host h=new Host();
		 h.playMusic(music);
		 System.out.println("---------------");
		 
		 System.out.println("准备指定播放第几首歌？");
		 int x=in.nextInt();
		
		 h.SpecifyThePlay(music, x-1);
		 in.close();
	}

}
