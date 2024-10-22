package lib;


import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;

public class BookUtil {
	public static void SaveBook(Book book, DataOutputStream dos) throws IOException {
		try {
			dos.writeUTF(book.getIsbn());
			dos.writeUTF(book.getTitle());
			dos.writeUTF(book.getBt().toString());
			dos.writeDouble(book.getPrice());
			dos.writeUTF(book.getPubDate().toString());
			dos.writeUTF(book.getAuthor());
			System.out.println("saved successfully");
			dos.flush();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

	public static void SaveBookList(List<Book> blist, DataOutputStream dos) throws IOException {

		{
			for (Book book : blist) {
				SaveBook(book, dos);

			}

			System.out.println("Booklist saved successfully");
		}

	}

	public static Book ReadBook(DataInputStream dis) throws IOException {

		{

			return new Book(dis.readUTF(), dis.readUTF(), BookType.valueOf(dis.readUTF()), dis.readDouble(),
					parse(dis.readUTF()), dis.readUTF());

		}

	}

	public static List<Book> ReadBookList(DataInputStream dis) throws IOException {

		{
			List<Book> blist = new ArrayList<>();

			while (dis.available() > 0) {
				Book b = ReadBook(dis);
				blist.add(b);
			}

			return blist;

		}

	}

}
