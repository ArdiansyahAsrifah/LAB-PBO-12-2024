import javax.sound.sampled.*;

public class audio {
    public void play(String audioFilePath) {
        try (AudioInputStream audioInputStream = AudioSystem
                .getAudioInputStream(getClass().getResource(audioFilePath))) {
            AudioFormat format = audioInputStream.getFormat();
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, format));

            line.open(format);
            ;
            line.start();

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                line.write(buffer, 0, bytesRead);
            }

            line.drain();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}