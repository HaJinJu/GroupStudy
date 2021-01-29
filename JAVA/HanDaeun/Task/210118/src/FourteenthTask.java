public class FourteenthTask {
    public static void main(String[] args) {
        System.out.println("************* A 그룹 *************");
        DivideTeams TeamA = new DivideTeams(1, 11, 4);
        TeamA.makeTeams();

        System.out.println("\n\n************* B 그룹 *************");
        DivideTeams TeamB = new DivideTeams(10, 8, 3);
        TeamB.makeTeams();
    }
}