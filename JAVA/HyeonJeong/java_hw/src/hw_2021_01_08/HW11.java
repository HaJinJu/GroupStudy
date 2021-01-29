package hw_2021_01_08;

public class HW11 {
    public static void main(String[] args) {
        Allocate_Random_Array ara = new Allocate_Random_Array();

        ara.allocate_random_number_to_array();
        ara.print_random_array();

        ara.delete_random_number_value();
        ara.print_random_array();
    }
}
