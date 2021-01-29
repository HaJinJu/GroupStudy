package jan0113;

class Transport{
    private final String size;
    private final String nic;
    private final String species;
    private final String enginePA;

    public Transport(String Size,String nic,String species,String enginePA) {
        this.size = Size;
        this.nic = nic;
        this.species = species;
        this.enginePA = enginePA;
    }
        public String getSize() {
            return size;
        }
        public String getnic() {
            return nic;
        }

        public String getspecies() {
            return species;
        }
        public String getenginePA(){
            return enginePA;
        }

    @Override
    public String toString() {
        return "Transport{" +
                "size='" + size + '\'' +
                ", nic='" + nic + '\'' +
                ", species='" + species + '\'' +
                ", enginePA='" + enginePA + '\'' +
                '}';
    }
}


class overseas extends Transport {
    private String canFishingOrNot;

    public overseas(String size, String nic, String species, String enginePA, String canFishingOrNot) {
        super(size, nic, species, enginePA);
        this.canFishingOrNot = canFishingOrNot;
    }

    @Override
    public String toString() {
        return "overseas{" +
                "size="+super.getSize()+'\''+
                "nic="+super.getnic()+'\''+
                "species"+super.getspecies()+'\''+
                "enginePA"+super.getenginePA()+'\''+
                "canFishingOrNot='" + canFishingOrNot + '\'' +
                '}';
    }

    public void setCanFishingOrNot(String canFishingOrNot) {
        this.canFishingOrNot = canFishingOrNot;
    }

}

class land extends Transport{
    private String wheel;

    public land(String size, String nic, String species, String enginePA,String wheel){
        super(size, nic, species, enginePA);
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "land{" +
                "size="+super.getSize()+'\''+
                "nic="+super.getnic()+'\''+
                "species"+super.getspecies()+'\''+
                "enginePA"+super.getenginePA()+'\''+
                "wheel='" + wheel + '\'' +
                '}';
    }
}
public class Homework2 {
    public static void main(String[] args) {
        overseas T = new overseas("대형","타이타닉","배","유","불가능하니다 ");
            System.out.println(T);

        land L = new land("소형","스케이트보드","취미용","무","4개");
        System.out.println(L);
        }
    }



