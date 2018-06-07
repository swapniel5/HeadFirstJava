package Chap02;

class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("Bang bang Ba bang");
	}

	void playTopHat() {
		System.out.println("Ding Ding Da Dang");
	}

}

class DrumKitTestDrive {

	public static void main(String args[]) {
		DrumKit d = new DrumKit();

		if (d.snare == true) {
			d.playSnare();
			d.snare = false;
		}
		d.playTopHat();
	}
}
