package yinyuediange;

public class Host {
	public void playMusic(MusicInfo[] music) {
		System.out.println("��ʼ��˳�򲥷ţ�");
		for(MusicInfo m:music) {
		System.out.println("����"+m.getMusicName());
	    }
	}
	
	public void SpecifyThePlay(MusicInfo[] music,int i) {
		System.out.println("��׼��ָ������"+music[i].getMusicName()+"���׸衣");
	}
    public Host() {
	
    }
	

}
