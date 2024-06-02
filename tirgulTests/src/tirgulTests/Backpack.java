package tirgulTests;

public class Backpack {
	private int[] itemIds;
	private int[] itemQuantities;
	private int currentSize;

	
	
	public Backpack(int num) {
        itemIds = new int[num];
        itemQuantities = new int[num];
        currentSize = 0;
	}
	
	public int[] getItemIds() {
		return itemIds;
	}
	
    public int[] getItemQuantities() {
        return itemQuantities;
    }
    
    public int getCurrentSize() {
        return currentSize;
    }
    
    public void setItemIds(int[] itemIds) {
    	this.itemIds = itemIds;
    }
    
    public void setItemQuantities(int[] itemQuantities) {
        this.itemQuantities = itemQuantities;
    }
    
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
    
    public void addItem(int itemId, int quantity) {
        itemIds[currentSize] = itemId;
        itemQuantities[currentSize] = quantity;
        currentSize++;
    }
    
    public void removeItem(int itemId) {
    	for(int i = 0; i<currentSize; i++) {
    		if(itemIds[i] == itemId) {
    			for(int j = 0; j<currentSize; j++) {
                    itemIds[j] = itemIds[j + 1];
                    itemQuantities[j] = itemQuantities[j + 1];
    			}
                itemIds[currentSize - 1] = 0;
                itemQuantities[currentSize - 1] = 0;
                currentSize--;
    		}
    	}
    }

    public int getQuantity(int itemId){
        for (int i = 0; i<currentSize; i++){
            if(itemIds[i] == itemId){
                return itemQuantities[i];
        }
           
    }
        return 0;
    }

    public void updateItemQuantity(int itemId, int newQuantity){
            for (int i = 0; i<currentSize; i++){
                if(itemIds[i] == itemId){
                    itemQuantities[i] = newQuantity;
        }
    }
    }

public boolean isSameAs(Backpack other) {

    if (this.itemQuantities.length != other.getItemQuantities().length) {
        return false;
    }

    for (int i = 0; i < this.itemQuantities.length; i++) {
        if (this.itemQuantities[i] != other.getItemQuantities()[i]) {
            return false;
        }
    }
    return true;
}

public boolean hasMoreItemsThan(Backpack other){
    int count1 = 0;

    for(int i = 0; i<this.itemIds.length; i++){
        if(this.itemQuantities[i] != 0){
            count1++;
        }
    }
    for(int i = 0; i<other.itemIds.length; i++){
        if(other.getItemQuantities()[i] != 0){
            count1--;
        }
    }
    return count1>0;
}
}
