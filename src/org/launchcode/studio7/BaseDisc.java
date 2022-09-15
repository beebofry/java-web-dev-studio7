package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String contents;
    private String discType;
    private boolean reWriteable;
    private int availableData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public boolean isReWriteable() {
        return reWriteable;
    }

    public void setReWriteable(boolean reWriteable) {
        this.reWriteable = reWriteable;
    }

    public int getAvailableData() {
        return availableData;
    }

    public void setAvailableData(int availableData) {
        this.availableData = availableData;
    }

    public BaseDisc(String name, int capacity, String contents, String discType, boolean reWriteable, int availableData) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.reWriteable = reWriteable;
        this.availableData = availableData;
    }

//    public int calculateStorage(){
//
//    }
}
