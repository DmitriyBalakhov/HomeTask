import java.util.*;

public class CollectionTask {

    static ArrayList<Integer> generateArrayList() {
        return new ArrayList<>();
    }

    static ArrayList<Integer> fillArrayList(ArrayList<Integer> arrayList) {
        int min = -10;
        int max = 10;
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextInt((max - min + 1) + min));
        }
        System.out.printf("Task 2 - Fill the Collection with random numbers %s", arrayList);
        System.out.println();
        return arrayList;
    }

    static ArrayList<Integer> createCopyArrayList(ArrayList<Integer> arrayList) {
        return new ArrayList<>(arrayList);
    }

    static ArrayList<Integer> createSecondCopyArrayList(ArrayList<Integer> arrayList) {
        return (ArrayList<Integer>) arrayList.clone();
    }
    //№4
    static Set<Integer> createSet(ArrayList<Integer> arrayList) {
        return new HashSet<>(arrayList);
    }
    //№5
    static ArrayList<Integer> sortCollection(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }
    //№6.1
    static Integer minCollection(ArrayList<Integer> arrayList) {
        return Collections.min(arrayList);
    }
    //№6.2
    static Integer maxCollection(ArrayList<Integer> arrayList) {
        return Collections.max(arrayList);
    }
    //№7
    static Integer sumCollection(ArrayList<Integer> arrayList) {
        return arrayList.stream().mapToInt(Integer::intValue).sum();
    }

    //№8
    static List<Integer> positiveNumbersCollection(ArrayList<Integer> arrayList) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer number : arrayList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    //№9
    public static boolean containsValue(ArrayList<Integer> collection, int value) {
        return collection.contains(value);
    }
    //№10
    private static int countOccurrences(ArrayList<Integer> numbers, int target) {
        int count = 0;
        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
    //№11
    public static void swapFirstAndLast(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int lastIndex = list.size() - 1;
            Integer temp = list.get(0);
            list.set(0, list.get(lastIndex));
            list.set(lastIndex, temp);
        }
    }
    //№12
    static ArrayList<Integer> expandInReverseOrder(ArrayList<Integer> arrayList) {
        ArrayList<Integer> reversedArrayList = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedArrayList.add(arrayList.get(i));
        }
        return reversedArrayList;
    }
    //№13
    static int secondLargest(ArrayList<Integer> arrayList) {
        arrayList.sort(Collections.reverseOrder());
        if (arrayList.size() < 2) {
            return -1;
        } else {
            return arrayList.get(1);
        }
    }
    //№14
     static boolean isPalindrome(ArrayList<Integer> arrayList) {
        ArrayList<Integer> reversedArrayList = new ArrayList<>(arrayList);
                Collections.reverse(reversedArrayList);
        return arrayList.equals(reversedArrayList);
}

    public class ListPerformanceTest {

        public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            // Populate both lists with 1,000,000 elements
            populateList(arrayList);
            populateList(linkedList);

            // Measure and compare the time for random access in both lists
            measureRandomAccessTime(arrayList, "ArrayList");
            measureRandomAccessTime(linkedList, "LinkedList");
        }
        private static void populateList(List<Integer> list) {
            for (int i = 0; i < 1_000_000; i++) {
                list.add(i);
            }
        }
        private static void measureRandomAccessTime(List<Integer> list, String listType) {
            Random random = new Random();
            int totalAccesses = 100_000;
            long startTime = System.nanoTime();

            for (int i = 0; i < totalAccesses; i++) {
                int index = random.nextInt(1_000_000); // Random index for access
                list.get(index); // Access element at random index
            }


            public static void main(String[] args){
            ArrayList<Integer> emptyArrayList = generateArrayList();
            System.out.println("Task 1 - Generate a collection of integers " + emptyArrayList);
            ArrayList<Integer> arrayList = fillArrayList(emptyArrayList);
            ArrayList<Integer> firstCopy0fArrayList = createCopyArrayList(arrayList);
            System.out.println("Task 3.1 - Create copy using constructor" + firstCopy0fArrayList);
            ArrayList<Integer> secondCopyOfArrayList = createSecondCopyArrayList(arrayList);
            System.out.println("Task 3.2  - Create copy using clone method" + secondCopyOfArrayList);
            System.out.println("Task 4 - Create a collection with unique values" + createSet(arrayList));
            System.out.println("Task 5 - Sort the collection" + sortCollection(arrayList));
            System.out.println("Task 6.1 - Min value from collection " + minCollection(arrayList));
            System.out.println("Task 6.2 - Max value from collection " + maxCollection(arrayList));
            System.out.println("Task 7 - Collection values sum " + sumCollection(arrayList));
            System.out.println("Task 8 - Collection with positive numbers " + positiveNumbersCollection(arrayList));
            int valueToCheck = 3;
            boolean containsValue = containsValue(arrayList, valueToCheck);
            System.out.println("Task 9 - The collection contains " + valueToCheck + ": " + containsValue);
            int targetNumber = 5;
            int occurrences = countOccurrences(arrayList, targetNumber);
            System.out.println("Task 10 - Number of occurrences of " + targetNumber + ": " + occurrences);
            ArrayList<Integer> reversedArrayList = expandInReverseOrder(arrayList);
            swapFirstAndLast(arrayList);
            System.out.println("Task 11 - List after swapping first and last elements: " + arrayList);
            System.out.println("Task 12 - Collection in reverse order  " + reversedArrayList);
            System.out.println("Task 13 - Second largest number in Collection " + secondLargest(arrayList));
            System.out.println("Task 14 - Palindrome test " + isPalindrome(arrayList));


        }
    }