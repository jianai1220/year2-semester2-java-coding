public class Cinema {
    private String name;
    private Seat[][] seats;
    
    public Cinema(String name, int rows, int cols){
        this.name = name;
        this.seats = new Seat[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                seats[i][j] = new Seat();
            }
        }
    }

    public void reserveSeat(int row, int col){
        seats[row-1][col-1].setReserved(true);
    }

    public void printSeats(){
        System.out.println("Seating Plan for "+name+":");
        for(Seat[]row : seats){
            for(Seat seat : row){
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public int getRowCount(){
        return seats.length;
    }

    public int getColumnCount(){
        return seats[0].length;
    }

    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Cinema Hall 1", 5, 7);
        Cinema cinema2 = new Cinema("Cinema Hall 2", 4, 6);

        cinema1.reserveSeat(3, 4);
        cinema1.reserveSeat(1, 2);
        cinema2.reserveSeat(2, 3);
        cinema2.reserveSeat(4, 5);

        cinema1.printSeats();
        System.out.println();
        cinema2.printSeats();

        System.out.println("Number or rows in Cinema 1: " + cinema1.getRowCount());
        System.out.println("Number or columns in Cinema 1: " + cinema1.getColumnCount());
        System.out.println("Number or rows in Cinema 2: " + cinema2.getRowCount());
        System.out.println("Number of columns in Cinema 2: " + cinema2.getColumnCount());
    }
}

class Seat {
    private boolean reserved;
    public void setReserved(boolean reserved){
        this.reserved = reserved;
    }

    @Override
    public String toString(){
        return reserved ? "X" : "-";
    }
}
