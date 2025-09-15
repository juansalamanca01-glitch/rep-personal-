public class Main {
    public static void main(String[] args) {
        // Crear conjunto de 10 estudiantes
        Student[] students = {
            new Student(20, 4, 3, 8, 6, "Ingeniería de Sistemas", 101),
            new Student(19, 3, 2, 6, 8, "Derecho", 102),
            new Student(22, 6, 4, 12, 2, "Medicina", 103),
            new Student(21, 5, 3, 10, 4, "Arquitectura", 104),
            new Student(18, 2, 1, 4, 10, "Psicología", 105),
            new Student(25, 8, 5, 16, 0, "Administración", 106),
            new Student(20, 4, 2, 8, 6, "Biología", 107),
            new Student(23, 7, 4, 14, 2, "Ingeniería Industrial", 108),
            new Student(19, 3, 3, 6, 8, "Comunicación Social", 109),
            new Student(24, 9, 6, 18, 0, "Economía", 110)
        };

        System.out.println("=== LISTADO ORIGINAL DE ESTUDIANTES ===");
        printStudents(students);

        // 1. Aplicar Insertion Sort por edad (ASC)
        Student[] studentsByAge = students.clone();
        SortingAlgorithms.insertionSortByAge(studentsByAge);
        System.out.println("\n=== DESPUÉS DE INSERTION SORT (por edad ASC) ===");
        printStudents(studentsByAge);

        // 2. Aplicar Selection Sort por semestre (DESC)
        Student[] studentsBySemester = students.clone();
        SortingAlgorithms.selectionSortBySemester(studentsBySemester);
        System.out.println("\n=== DESPUÉS DE SELECTION SORT (por semestre DESC) ===");
        printStudents(studentsBySemester);

        // 3. Búsqueda Lineal por programId
        int targetId = 105;
        Student foundStudent = SearchAlgorithms.linearSearchByProgramId(students, targetId);
        System.out.println("\n=== BÚSQUEDA LINEAL POR PROGRAM ID " + targetId + " ===");
        if (foundStudent != null) {
            System.out.println(" Estudiante encontrado:");
            foundStudent.printInfo();
        } else {
            System.out.println(" Estudiante no encontrado.");
        }

        // 4. Búsqueda Binaria por edad (requiere ordenar primero por edad)
        int targetAge = 22;
        Student[] sortedByAge = students.clone();
        SortingAlgorithms.insertionSortByAge(sortedByAge); // Ordenamos por edad
        Student foundByAge = SearchAlgorithms.binarySearchByAge(sortedByAge, targetAge);
        System.out.println("\n=== BÚSQUEDA BINARIA POR EDAD " + targetAge + " ===");
        if (foundByAge != null) {
            System.out.println(" Estudiante encontrado:");
            foundByAge.printInfo();
        } else {
            System.out.println(" Estudiante no encontrado.");
        }
    }

    // Método auxiliar para imprimir un arreglo de estudiantes
    public static void printStudents(Student[] students) {
        for (Student s : students) {
            s.printInfo();
        }
    }
}