package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import entidades.AdapterList;

class TestList {

	private List<String> lista = new AdapterList();
	private List<String> lista2 = new AdapterList();
	
	
	@Test
	public void testeAdd() {
		assertEquals(true, lista.add("map"));
		assertEquals(1, lista.size());
	}

	@Test
	public void testeContains() {
		lista.add("IA");
		assertEquals(true, lista.contains("IA"));
	}
	
	@Test
	public void testeRemove() {
		lista.add("web");
		lista.add("java");
		assertEquals("java", lista.remove(1));
		assertEquals(1, lista.size());
	}
	
	@Test
	public void testeIsEmpty() {
		assertTrue(lista.isEmpty());
		lista.add("cad");
		assertFalse(lista.isEmpty());
	}
	
	@Test
	public void testeGet() {
		lista.add("esw");
		assertEquals("esw", lista.get(0));
	}
	
	@Test
	public void testeEquals() {
		lista.add("ic");
		lista2 = lista;
		assertTrue(lista.equals(lista2));
	}
	@Test
	public void testeToArray() {
		lista.add("web");
		lista.add("map");
		String [] array = Arrays.asList(lista.toArray()).toArray(new String[0]);
		assertEquals("[web, map]", Arrays.toString(array));
	}
	
}
