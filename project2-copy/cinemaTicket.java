
public class cinemaTicket
{
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    float price;
    
    void displayInfo(){
        System.out.println("Nazwa kina: "+cinemaName);
        System.out.println(filmTitle);
        System.out.println(row);
        System.out.println(seat);
        System.out.println(price);
    };
    public static void main (String[] args) {
        cinemaTicket ticket1=new cinemaTicket("Harry", 10, 7);
        ticket1.displayInfo();
     }
     cinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle=filmTitle; 
        this.row = row;
        this.seat=seat;
        this.price = 10.0f; 
        if (row>2){
            this.price =25.0f;
        }
        else{
            this.price =10.0f;
        }
     }
}
