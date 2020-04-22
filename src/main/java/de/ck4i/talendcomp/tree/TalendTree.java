package de.ck4i.talendcomp.tree;

public class TalendTree extends GenericTree<Record> {
	
	public String getPath(Record record) {
		String ret = "";
		java.util.List<Record> parents = this.collectParents(record);
		for (Record parent : parents) {
			ret = "/" + parent.getKey().toString() + ret;
		}
		return ret;
	}
	
}
