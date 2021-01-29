package 정기역략평가01;
class ElectronicDevice {
    private String itTech;
    private String electronic;

    public ElectronicDevice(String itTech, String electronic){
        this.itTech = itTech;
        this.electronic = electronic;
    }

    public String getItTech() {
        return itTech;
    }

    public String getElectronic() {
        return electronic;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                " itTech='" + itTech + '\'' +
                ", electronic='" + electronic + '\'' +
                '}';
    }
}
class Mobile extends ElectronicDevice {
    private String inPorket;
    private String colour;

    public Mobile(String itTech, String electronic, String inPorket, String colour) {
        super(itTech, electronic);
        this.inPorket = inPorket;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                " itTech= '" + super.getItTech()+'\'' +
                ", electronic= '" + super.getElectronic()+'\'' +
                ", inPorket= '" + inPorket +'\'' +
                ", colour= '" + colour+ '\'' +
                '}';
    }
}

public class Exercise06 {
    public static void main(String[] args) {
        ElectronicDevice ed = new ElectronicDevice("yes","yes");
        System.out.println(ed);
        Mobile m = new Mobile("yes","yes","in porket","silver gray");
        System.out.println(m);

    }
}
