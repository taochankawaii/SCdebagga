package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Sc {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void snake() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String i = "TAO";
	String j = scu.snakeToCamelcase("t_a_o");
	assertThat(j,is(i));
	}
	@Test
	public void camel() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String i = "t_a_o";
	String j = scu.camelToSnakecase("TAO");
	assertThat(j,is(i));
	}
	@Test
	public void capi() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String i = "Tao";
	String j = scu.capitalize("tao");
	assertThat(j,is(i));
	}
	@Test
	public void uncapi() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String i = "tao";
	String j = scu.uncapitalize("Tao");
	assertThat(j,is(i));
	}
}
