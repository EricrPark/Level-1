import java.awt.Color;

public class ArtisyRunner {
	public static void main(String[] args) {
		ColorPalette palette = new ColorPalette(new Color(255, 0, 0), new Color(0, 255, 0), new Color(0, 0, 255));
		Vangough artist = new Vangough();
		artist.drawPalette(palette);
	}
}
