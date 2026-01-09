package apllication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		print(myObjs);
		copy(myDoubles, myObjs);
		print(myObjs);

	}

	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for (Number n : origem) {
			destino.add(n);
		}

	}

	public static void print(List<? extends Object> list) {
		for (Object saida : list) {
			System.out.print(saida + ", ");
		}
		System.out.println();
	}

}
