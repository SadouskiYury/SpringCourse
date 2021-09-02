package part1_xml_beans.music.genres;

import part1_xml_beans.music.Music;

public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "This is Jazz";
	}
}
