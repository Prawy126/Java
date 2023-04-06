import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//zadanie 4
public class Data {
    private LocalDate data;

    Data(){
        this.data = LocalDate.now();
    }
    void nastepnyDzien(){
        data = data.plusDays(1);

    }
    void poprzedniDzien(){
        data = data.minusDays(1);
    }

    void tekstowa(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // utworzenie formatera
        String tekstowaData = data.format(formatter); // formatowanie daty do postaci tekstowej
        System.out.println("Ustawiona jest data: " + tekstowaData); // wyświetlenie daty

    }
}
