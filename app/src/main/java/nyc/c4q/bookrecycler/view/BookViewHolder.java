package nyc.c4q.bookrecycler.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.bookrecycler.R;
import nyc.c4q.bookrecycler.model.Book;

/**
 * Created by c4q on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView author;
    private TextView yearPublished;

    public BookViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title_textview);
        author = (TextView) itemView.findViewById(R.id.author_textview);
        yearPublished = (TextView) itemView.findViewById(R.id.year_published_textview);
    }
    public void onBind(Book book){
        title.setText("Title: " + book.getTitle());
        author.setText("Author: " + book.getAuthor());
        yearPublished.setText("Year of Publication: " + book.getYearPublished());
    }
}
