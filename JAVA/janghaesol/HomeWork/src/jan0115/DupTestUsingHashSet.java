package jan0115;

public class DupTestUsingHashSet {
}
    /*
    // Generic function to check for duplicates in an array
    private static <T> boolean checkForDuplicates(T... array)
    {
        // create an empty set
        Set<T> set = new HashSet<T>();

        // do for every element in the array
        for (T e : array)
        {
            // return true if duplicate is found
            if (set.contains(e))
                return true;

            // insert current element into a set
            if (e != null)
                set.add(e);
        }

        // no duplicate found
        return false;
    }
    // Generic function to check for duplicates in an array
    private static <T> boolean checkForDuplicates(T... array)
    {
        Set<T> set = new HashSet<>(Arrays.asList(array));

        return array.length != set.size();
    }
}
*/
