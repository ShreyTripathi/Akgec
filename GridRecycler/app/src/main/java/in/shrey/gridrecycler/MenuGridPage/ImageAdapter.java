package in.shrey.gridrecycler.MenuGridPage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.shrey.gridrecycler.MainActivity;
import in.shrey.gridrecycler.R;

/**
 * Created by as on 25-Feb-17.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    MainActivity context;


    public ImageAdapter(MainActivity mainActivity) {
        this.context = mainActivity;

    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.grid_imageview, parent, false);
        return new ImageViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        int image = MainActivity.gridImage[position];
        String text = MainActivity.gridText[position];
        holder.imageView.setImageResource(image);


        Log.d("shrey", text + position);
        holder.textView.setText(text);

    }

    @Override
    public int getItemCount() {
        return MainActivity.gridImage.length;


    }
}
