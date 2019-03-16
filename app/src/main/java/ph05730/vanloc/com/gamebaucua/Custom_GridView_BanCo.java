package ph05730.vanloc.com.gamebaucua;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Custom_GridView_BanCo extends ArrayAdapter<Integer> {

    private Context context;
    private int resource;
    private Integer[] objects;
    private Integer[] giatien={0,100,200,300,400};


    public Custom_GridView_BanCo(Context context, int resource, Integer[] objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;

    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
      convertView = LayoutInflater.from(context).inflate(R.layout.custom_banco, parent, false);

        ImageView imBanCo =convertView.findViewById(R.id.imageBanCo);
        Spinner spGiaTien=convertView.findViewById(R.id.spinGiatien);

        imBanCo.setImageResource(objects[position]);


        return convertView;

    }
}
