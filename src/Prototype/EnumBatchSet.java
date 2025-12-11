package Prototype;

public enum EnumBatchSet {
	
	APR_BATCH("Apr-Batch"),
	MAY_BATCH("May-Batch");
	
	private final String label;
	
	
	EnumBatchSet(String label){
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
}
