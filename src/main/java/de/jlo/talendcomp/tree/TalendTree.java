package de.jlo.talendcomp.tree;

public class TalendTree extends GenericTree<Record> {
	public TalendTree() {
		
	}
	
	public String getPath(Record record) {
		String ret = "";
		java.util.List<Record> parents = this.collectParents(record);
		for (Record parent : parents) {
			ret = "/" + parent.getKey().toString() + ret;
		}
		
		return ret;
	}
}
