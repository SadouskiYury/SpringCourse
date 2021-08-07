package part1_xml_beans.music.types;

import part1_xml_beans.music.Music;

public class RockMusic implements Music {
	@Override
	public String getSong() {
		return "Rock Song";
	}
}
