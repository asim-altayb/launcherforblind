package net.zaczek.launcherforblind;

public class StaticListEntry extends AbstractListEntry {

	public StaticListEntry(String label) {
		super(label);
	}

	@Override
	public void onSelected() {
		
	}

	@Override
	public String getTextToSay() {
		return null;
	}
}
