package jp.truetech.hello;

public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("no message");
		}
		if (args.length > 0) {
			new Greeting().say(args[0]);
		}
	}
}
