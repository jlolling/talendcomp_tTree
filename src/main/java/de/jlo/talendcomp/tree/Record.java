/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.jlo.talendcomp.tree;

public class Record {
	
	private Object key = null;
	private Object struct = null;
	
	public Record(Object key) {
		this(key, null);
	}
	
	public Record(Object key, Object struct) {
		if (key == null) {
			throw new IllegalArgumentException("Key value cannot be null");
		}
		this.key = key;
		this.struct = struct;
	}
	/**
	 * add here the Talend transfer object (<rowname>Struct)
	 * @param struct Talend structure object
	 */
	public void addStruct(Object struct) {
		this.struct = struct;
	}
		
	/**
	 * Returns the key value
	 * @return
	 */
	public Object getKey() {
		return key;
	}

	public Object getStruct() {
		return struct;
	}
}
