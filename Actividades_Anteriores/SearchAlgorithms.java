public class SearchAlgorithms {

    /**
     * Linear Search - Busca un estudiante por programId
     * Complejidad: O(n)
     */
    public static Student linearSearchByProgramId(Student[] students, int targetId) {
        for (Student student : students) {
            if (student.getProgramId() == targetId) {
                return student;
            }
        }
        return null; // No encontrado
    }

    /**
     * Binary Search - Busca un estudiante por edad.
     * ¡El arreglo debe estar ordenado por edad ASC!
     * Complejidad: O(log n)
     */
    public static Student binarySearchByAge(Student[] students, int targetAge) {
        int left = 0;
        int right = students.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midAge = students[mid].getAge();

            if (midAge == targetAge) {
                return students[mid];
            } else if (midAge < targetAge) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // No encontrado
    }
}