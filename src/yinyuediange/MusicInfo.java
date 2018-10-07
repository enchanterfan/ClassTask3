package yinyuediange;

public class MusicInfo {
	private String musicname;
	private String singer;
	private float time;

    public MusicInfo() {
		
	}

	public MusicInfo(String musicname, String singer, float time) {
		super();
		this.musicname = musicname;
		this.singer = singer;
		this.time = time;
	}
	
//    public void setMusicName(String musicname) {
//	this.musicname=musicname;
//    }
    
    public String getMusicName() {
    	return musicname;
    }
	
//    public void setSinger(String singer) {
//    	this.singer=singer;
//        }
    
    public String getSinger() {
    	return singer;
    }
    
//    public void setTime(float time) {
//    	this.time=time;
//        }
    
    public float getTime() {
    	return time;
    }
}
