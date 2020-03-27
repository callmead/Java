//************************ PlayClip method ******************************************

//  	public void playClip(File getFile)
//  	{
//		File file;
//  		try
//  		{
//			file = getFile;
//  			AudioInputStream audiosource = AudioSystem.getAudioInputStream(file);
//            DataLine.Info info = new DataLine.Info(Clip.class, audiosource.getFormat());
//            clip = (Clip)AudioSystem.getLine(info);
//            clip.open(audiosource);
//		}
//		catch(UnsupportedAudioFileException e){}
//		catch(LineUnavailableException e){}
//		catch(IOException e){}
//		clip.start();
//  	}//End of playClip method

