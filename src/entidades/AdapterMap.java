package entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdapterMap implements Map{

	private List<String> list;
	
	public AdapterMap() {
		list = new ArrayList();
	}
	
	@Override
	public int size() {
		
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsValue(Object value) {
		if(!list.isEmpty()) {
			return list.contains(value);
		}
		return false;
	}

	@Override
	public Object get(Object key) {
		if(!list.isEmpty()) {
			int k = Integer.parseInt(key.toString());
			if(k < list.size() -1) {
				return list.get(k);
			}
		}
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		int index = Integer.parseInt(key.toString());
		list.add(index, value.toString());
		return list.get(index);
	}

	@Override
	public Object remove(Object key) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size(); i++) {
				if(list.get(i).equals(key.toString())) {
					String str = list.get(i);
					list.remove(i);
					return str;
				}
			}
		}
		return null;
	}

	@Override
	public void putAll(Map m) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void clear() {
		list.clear();
		
	}

	@Override
	public Set keySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection values() {
		if(!list.isEmpty()) {
			return list;
		}
		return null;
	}

	@Override
	public Set entrySet() {
		throw new UnsupportedOperationException();
	}

}
