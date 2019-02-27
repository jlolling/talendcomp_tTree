package de.jlo.talendcomp.tree;

import java.util.HashMap;
import java.util.Map;

public class Record {
	
	private Object key = null;
	private Map<String, Object> values = null;
	
	public Record(Object key) {
		if (key == null) {
			throw new IllegalArgumentException("Key value cannot be null");
		}
		this.key = key;
	}
	
	public Object addValue(String key, Object value) {
		if (values == null) {
			values = new HashMap<>();
		}
		return values.put(key, value);
	}
	
	public Object getValue(String key) {
		return values.get(key);
	}
	
	public Object getKey() {
		return key;
	}

}
