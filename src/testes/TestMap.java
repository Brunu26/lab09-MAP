package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import entidades.AdapterMap;

class TestMap {

	private Map map = new AdapterMap();
	private Map map2 = new AdapterMap();
	
	@Test
	public void testeAdd() {
		assertEquals("web", map.put(0, "web").toString());
	}

	@Test
	public void testeContains() {
		map.put(0,"cg");
		map.put(1, "ia");
		assertTrue(map.containsValue("cg"));
		assertTrue(map.containsValue("ia"));
	}
	@Test
	public void testeEquals() {
		map.put(0, "test");
		map2 = map;
		assertTrue(map.equals(map2));
		
	}
	@Test
	public void testeGet() {
		map.put(0, "ia");
		map.put(1, "Teste2");
		assertEquals("ia", map.get(0));
	}
	
	@Test
	public void testeIsEmpty() {
		assertTrue(map.isEmpty());
		map.put(0,"mat");
		assertFalse(map.isEmpty());
	}
	
	@Test
	public void testeRemove() {
		map.put(0, "bruno");
		assertEquals("bruno", map.remove("bruno"));
	}
	
	@Test
	public void testeToArray() {
		map.put(0, "bruno");
		map.put(1, "teste");
		assertEquals("[bruno, teste]", map.values().toString());
	}
}
