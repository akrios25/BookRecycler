package nyc.c4q.bookrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.bookrecycler.controller.BookAdapter;
import nyc.c4q.bookrecycler.model.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Foundation", "Isaac Asimov", 1951));
        books.add(new Book("There Will Come Soft Rains", "Ray Bradbury", 1950 ));
        books.add(new Book("The Silmarillion", "J.R.R Tolkien", 1977));
        books.add(new Book("It's Kind of a Funny Story", "Ned Vizzini", 2006));
        books.add(new Book("The Perks of Being a Wallflower", "Ned Vizzini", 1991));
        books.add(new Book("Slaughterhouse Five", "Kurt Vonnegut", 1969));
        books.add(new Book("Small Gods", "Terry Pratchett", 1992));
        books.add(new Book("Sandman Chronicles", "Neil Gaiman", 1989));
        books.add(new Book("Sandman Overture", "Neil Gaiman",2015));
        books.add(new Book("Duma Key", "Stephen Kind", 2008));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("Americanah", "Chimamanda Ngozi Adichie",2013));

        BookAdapter bookAdapter = new BookAdapter(books);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
