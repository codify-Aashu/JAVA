package p1;

import java.io.Serializable;

public class A implements Serializable {//serializable is marker interface...
	String city = "chennai";
	transient String password = "testing";

}