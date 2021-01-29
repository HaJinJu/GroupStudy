package Eleventh.Homework;

class Human {
    private String humanity;
    private String useTool;
    private String species;
    private String sex;

    public Human(String humanity, String useTool, String species, String sex) {
        this.humanity = humanity;
        this.useTool = useTool;
        this.species = species;
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanity='" + humanity + '\'' +
                ", useTool='" + useTool + '\'' +
                ", species='" + species + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
 class Animals extends Human{
     public Animals(String humanity, String useTool, String species, String sex) {
         super(humanity, useTool, species, sex);
     }

     @Override
     public String toString() {
         return "Animals{" +

                 "species='" + super.getSpecies() + '\'' +
                 ", sex='" + super.getSex() + '\'' +
                 '}';

     }
 }



public class AnimalsAreNotHuman {
    public static void main(String[] args) {
        Human h = new Human("사람","사용","동물","남자");
        System.out.println(h);
        Animals a = new Animals("아님","미사용","동물","여자");
        System.out.println(a);


    }
}
