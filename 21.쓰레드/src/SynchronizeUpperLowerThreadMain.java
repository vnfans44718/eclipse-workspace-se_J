
class SynchronizeUpperLowerPrintShareObject {
	public void printUpper() {
		synchronized (this) {
			System.out.print("A");
			System.out.print("B");
			System.out.print("C");
			System.out.print("D");
			System.out.print("E");
			System.out.print("F");
			System.out.print("G");
			System.out.print("H");
			System.out.print("I");
			System.out.print("J");
			System.out.print("K");
			System.out.print("L");
			System.out.print("M");
			System.out.print("N");
			System.out.print("O");
			System.out.print("P");
			System.out.print("Q");
			System.out.print("R");
			System.out.print("S");
			System.out.print("T");
			System.out.print("U");
			System.out.print("V");
			System.out.print("W");
			System.out.print("X");
			System.out.print("Y");
			System.out.print("Z");
			System.out.println();
		}

	}

	public void printLower() {
		synchronized (this) {
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.print("d");
			System.out.print("e");
			System.out.print("f");
			System.out.print("g");
			System.out.print("h");
			System.out.print("i");
			System.out.print("j");
			System.out.print("k");
			System.out.print("l");
			System.out.print("m");
			System.out.print("n");
			System.out.print("o");
			System.out.print("p");
			System.out.print("q");
			System.out.print("r");
			System.out.print("s");
			System.out.print("t");
			System.out.print("u");
			System.out.print("v");
			System.out.print("w");
			System.out.print("x");
			System.out.print("y");
			System.out.print("z");
			System.out.println();
		}
	}

}

class SynchronizeUpperPrintThread extends Thread {
	private SynchronizeUpperLowerPrintShareObject shareObject;

	public SynchronizeUpperPrintThread(SynchronizeUpperLowerPrintShareObject shareObject) {
		this.shareObject = shareObject;
	}

	@Override
	public void run() {
		while (true) {

			try {
				shareObject.printUpper();
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class SynchronizeLowerPrintThread extends Thread {
	private SynchronizeUpperLowerPrintShareObject shareObject;

	public SynchronizeLowerPrintThread(SynchronizeUpperLowerPrintShareObject shareObject) {
		this.shareObject = shareObject;
	}

	@Override
	public void run() {
		while (true) {
			try {
				shareObject.printLower();
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintShareObject shareObject1 = new SynchronizeUpperLowerPrintShareObject();
		// SynchronizeUpperLowerPrintShareObject shareObject2=new
		// SynchronizeUpperLowerPrintShareObject();
		SynchronizeUpperPrintThread upperThread = new SynchronizeUpperPrintThread(shareObject1);
		SynchronizeLowerPrintThread lowerThread = new SynchronizeLowerPrintThread(shareObject1);
		upperThread.start();
		lowerThread.start();

	}

}