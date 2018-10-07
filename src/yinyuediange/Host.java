package yinyuediange;

public class Host {
	public void playMusic(MusicInfo[] music) {
		System.out.println("开始按顺序播放：");
		for(MusicInfo m:music) {
		System.out.println("播放"+m.getMusicName());
	    }
	}
	
	public void SpecifyThePlay(MusicInfo[] music,int i) {
		System.out.println("我准备指定播放"+music[i].getMusicName()+"这首歌。");
	}
    public Host() {
	
    }
	

}
