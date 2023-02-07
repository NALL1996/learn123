package com.sivasoft.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyElementsInList {

	public static void main(String[] args) {
		List<String> sls = new ArrayList<String>();
		sls.add("A");
		sls.add("B");
		sls.add("C");
		sls.add("D");
		List<String> tls = new ArrayList<String>();
		tls.add("V");
		tls.add("W");
		tls.add("X");
		tls.add("Y");
		tls.add("Z");
		System.out.println("tls before copy: " + tls);
		Collections.copy(tls, sls);
		System.out.println("tls after copy: " + tls);
	}

}
