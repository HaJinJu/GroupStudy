package jan0115;

public class DupTest {
    // Generic function to check for duplicates in an array
    private static <T> boolean checkForDuplicates(T... array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != null && array[i].equals(array[j])) {
                    return true;
                }
            }
        }

        // no duplicate found
        return false;
    }
}
