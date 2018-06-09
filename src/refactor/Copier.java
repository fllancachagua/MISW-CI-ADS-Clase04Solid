package refactor;

import copy1.*;
import java.io.IOException;

public class Copier {

	public static void copy(DeviceInput din, DeviceOutput dout) throws IOException {
		String inputValue = "";
		while (!(inputValue = din.read()).equals("-1")) {
			dout.write(inputValue);
		}
	}
}