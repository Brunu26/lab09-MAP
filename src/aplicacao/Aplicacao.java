package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import entidades.AdapterList;
import entidades.AdapterMap;

public class Aplicacao {

	public static void main(String[] args) {
		List<String> lista = new AdapterList();
		List<String> lista1 = new AdapterList();
		Map<Integer, String> map  = new AdapterMap();
		Map<Integer, String> map1  = new AdapterMap();
		
		lista.add("bruno");
		lista.add("abc");
		lista.add("123");
		
		map.put(0, "pedro");
		map.put(1, "def");
		map.put(2, "456");
		
		/*
		 * System.out.println("Operações da lista\n");
		 * 
		 * lista1 = lista; System.out.println(lista.equals(lista1));
		 * System.out.println(lista.contains("bruno"));
		 * System.out.println(lista.contains("abc"));
		 * System.out.println(lista.isEmpty()); System.out.println(lista.size());
		 * System.out.println(lista.get(0)); System.out.println(lista.remove(2));
		 * System.out.println(lista.size()); lista.clear();
		 * System.out.println(lista.size());
		 * 
		 * System.out.println("\nOperações do map\n"); map1 = map;
		 * System.out.println(map.equals(map1));
		 * System.out.println(map.containsValue("pedro"));
		 * System.out.println(map.containsValue("def")); System.out.println(map.get(0));
		 * System.out.println(map.remove("456")); System.out.println(map.size());
		 * System.out.println(map.isEmpty());
		 * System.out.println(map.values().toString()); map.clear();
		 * System.out.println(map.size());
		 */
		System.out.println(map.get(0));
	}

}
