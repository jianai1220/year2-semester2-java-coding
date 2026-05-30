public class Array2DSeating {
    public static void main(String[] args) {
        String[][] classroom = {
            {"Alice", "Bob","Carol","David"},
            {"Eve", "Frank", "Grace", "Harry"},
            {"Ivy", "Jack", "Katie", "Liam"}
        };

        System.out.println("Classroom Seating Arrangement:");

        for(int i = 0; i < classroom.length; i++){
            for(int j = 0; j < classroom[i].length; j++)
                System.out.print(classroom[i][j] + "\t");
            System.out.println();
        }

        int row = 1;
        int col = 2;
        System.out.println("\nThe student at row " + row + " and column " + col + " is: " + classroom[row][col]);

        String newStudent = "Olivia";
        classroom[row][col] = newStudent;

        System.out.println("\nUpdated Classroom Seating Arrangement:");
        for(int i = 0; i < classroom.length; i++){
            for(int j = 0; j < classroom[i].length; j++)
                System.out.print(classroom[i][j] + "\t");
            System.out.println();
        }
    }
}
