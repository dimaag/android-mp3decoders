package com.axelby.mp3decoders;

public interface IMediaDecoder {
	void close();
	int readFrame(short[] buffer);
	boolean skipFrame();
	int seek(float offsetInSeconds);
	float getPosition();
	int getNumChannels();
	int getRate();
	float getDuration();

	// for streaming
	public int getSeekFrameOffset(float position);
	public void feed(byte[] buffer, int count);
	public void completeStream();
	public boolean isStreamComplete();

}
