package com.example.leesangmu1.gridtest01;

/**
 * Created by leesangmu1 on 2017-11-24.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotosAdapter extends BaseAdapter {
    private final Context mContext;
    private final Photo[] photos;

    // 1
    public PhotosAdapter(Context context, Photo[] photos) {
        this.mContext = context;
        this.photos = photos;
    }

    // 2
    @Override
    public int getCount() {
        return photos.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Photo book = photos[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_photo, null);
        }

        // 3
        final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_cover_art);
        final TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_photo_name);
        final TextView authorTextView = (TextView)convertView.findViewById(R.id.textview_photo_author);
        final ImageView imageViewFavorite = (ImageView)convertView.findViewById(R.id.imageview_favorite);

        // 4
        imageView.setImageResource(book.getImageResource());
        nameTextView.setText(mContext.getString(book.getName()));
        authorTextView.setText(mContext.getString(book.getAuthor()));

        return convertView;
    }

}

