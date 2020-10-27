package entidades;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class AdapterList implements List{

	private Map<Integer, String> map;
	
	public AdapterList() {
		
		map = new HashMap<Integer, String>();
	}
	
	@Override
	public int size() {
		
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		
		return map.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		if(map.isEmpty()) {
			return false;
		}
		return map.containsValue(o.toString());
	}

	@Override
	public Iterator iterator() {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public Object[] toArray() {
		if(map.isEmpty()) {
			return null;
		}
		return map.values().toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(Object e) {
		int mapInicial = map.size();
		map.put(map.size(), e.toString());
		if(map.size() > mapInicial) {
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		
			map.clear();
		
		
	}

	@Override
	public Object get(int index) {
		if(!map.isEmpty()) {
			if(map.get(index)!=null) {
				return map.get(index);
				
			}
		}
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, Object element) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public Object remove(int index) {
		if(!map.isEmpty()) {
			if(map.containsKey(index)) {
				return map.remove(index);
			}
		}
		return null;
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

}
