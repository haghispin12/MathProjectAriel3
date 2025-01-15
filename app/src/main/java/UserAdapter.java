import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mathprojectariel3.Fruit;
import com.example.mathprojectariel3.FruitAdapter;
import com.example.mathprojectariel3.R;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{

        public interface OnItemClickListener {
            void onItemClick(Fruit item);
        }
        private ArrayList<Fruit> fruits;
        private FruitAdapter.OnItemClickListener listener;
    public FruitAdapter(ArrayList<Fruit> fruits, FruitAdapter.OnItemClickListener listener){
            this.fruits = fruits;
            this.listener = listener;
        }

        @NonNull
        @Override
        public FruitAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view,viewGroup,false);
            return new FruitAdapter.MyViewHolder(view);

        }
        public void onBindViewHolder(FruitAdapter.MyViewHolder holder, int position){
            holder.bind(fruits.get(position),listener);
        }
        public int getItemCount(){
            return fruits.size();
        }
        public static class MyViewHolder extends RecyclerView.ViewHolder{
            private TextView tvFruitName;
            private ImageView ivFruitImg;
            public MyViewHolder(View itemView){
                super(itemView);
                tvFruitName=itemView.findViewById(R.id.tvFruitName);
                ivFruitImg = itemView.findViewById(R.id. ivFruitImg);
            }
            public void bind(final Fruit item,final FruitAdapter.OnItemClickListener listener){
                tvFruitName.setText(item.getName());
                ivFruitImg.setImageResource(item.getDrawable());
                itemView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        listener.onItemClick(item);
                    }
                    //   itemView.setOnClickListener(new View.OnClickListener() {



                });
            }
        }}


}
