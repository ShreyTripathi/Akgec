package in.shrey.gridrecycler.MenuGridPage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.shrey.gridrecycler.R;

/**
 * Created by as on 25-Feb-17.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;

    public ImageViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.grid_image_view);
        textView = (TextView) itemView.findViewById(R.id.grid_text_view);

    }

    public void fullWeb() {
        //code for full Web clicked
    }

    public void feedBack() {
        //  code for feedBack  clicked
    }
}
