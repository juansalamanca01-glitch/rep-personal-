public class SortingAlgorithms {

    /**
     * Insertion Sort - Ordena por edad (ASC: menor a mayor)
     * Complejidad: O(n²)
     */
    public static void insertionSortByAge(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getAge() > key.getAge()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    /**
     * Selection Sort - Ordena por semestre (DESC: mayor a menor)
     * Complejidad: O(n²)
     */
    public static void selectionSortBySemester(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getSemester() > students[maxIndex].getSemester()) {
                    maxIndex = j;
                }
            }
            Student temp = students[i];
            students[i] = students[maxIndex];
            students[maxIndex] = temp;
        }
    }
}