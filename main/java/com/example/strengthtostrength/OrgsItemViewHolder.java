package com.example.strengthtostrength;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class OrgsItemViewHolder extends RecyclerView.ViewHolder {

    CardView cardView;
    ImageView imageView;
    TextView names;
    TextView address;
    TextView email;
    TextView phone;
    TextView website;

    public OrgsItemViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardView);
        imageView = itemView.findViewById(R.id.imageView);
        names = itemView.findViewById(R.id.orgName);
        address = itemView.findViewById(R.id.orgAddress);
        email = itemView.findViewById(R.id.orgEmail);
        phone = itemView.findViewById(R.id.orgPhone);
        website =itemView.findViewById(R.id.orgWebsites);

    }
}
