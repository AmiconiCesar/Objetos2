package ar.edu.unlp.info.oo2.ejercicio3_MediaPlayer;

public class VStreamAdapter extends Media{
	
	
	private VideoStream videostream;
	
	
	public VStreamAdapter (VideoStream videostream) {
		 this.setVideostream(videostream);
	}


	public VideoStream getVideostream() {
		return videostream;
	}


	public void setVideostream(VideoStream videostream) {
		this.videostream = videostream;
	}
	
	@Override
	public void play() {
		this.videostream.reproduce();
	}
	

}
