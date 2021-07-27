package PracticeProject;

public class Equipment {
private final int barcode;
private String name, type;

    public Equipment(int barcode, String name, String type) {
        this.barcode = barcode;
        this.name = name;
        this.type = type;
    }
    public int getBarcode(){
        return barcode;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
