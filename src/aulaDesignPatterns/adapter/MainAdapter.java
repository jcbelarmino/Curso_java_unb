package aulaDesignPatterns.adapter;

//Interface Target
interface MediaPlayer {
	void play(String filename);
}

//Classe Adaptee
class AdvancedAudioPlayer {
	public void playMp3(String filename) {
		System.out.println("Playing MP3 file: " + filename);
	}
}

//Classe Adapter
class Mp3PlayerAdapter extends AdvancedAudioPlayer implements MediaPlayer {
	public void play(String filename) {
		playMp3(filename);
	}
}

//Exemplo de uso do padrão Class Adapter
public class MainAdapter {
	public static void main(String[] args) {
		// Criando uma instância do adaptador
		MediaPlayer mediaPlayer = new Mp3PlayerAdapter();

		// Utilizando o adaptador para reproduzir um arquivo de áudio
		mediaPlayer.play("song.mp3");
	}
}
