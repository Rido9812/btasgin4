
package authorr;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Handle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Author author = new Author();
        System.out.print("Nhap ID tac gia: ");
        author.setAuthorID(scanner.nextLine());

        System.out.print("Nhap ten tac gia: ");
        author.setName(scanner.nextLine());

      
        System.out.print("Nhap ngay sinh cua tac gia (dd/MM/yyyy): ");
        String dateOfBirthString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            author.setDateOfBirth(dateFormat.parse(dateOfBirthString));
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le.");
            return;
        }

        
        Book book = new Book();
        System.out.print("Nhap ID sach: ");
        book.setID(scanner.nextLine());

        System.out.print("Nhap ten sach: ");
        book.setTitle(scanner.nextLine());

        
        book.setAuthor(author);

        
        System.out.println("Thong tin sach:");
        System.out.println(book.toString());
    }
}


