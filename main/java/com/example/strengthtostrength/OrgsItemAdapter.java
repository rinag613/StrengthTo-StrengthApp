package com.example.strengthtostrength;

import android.animation.Animator;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class OrgsItemAdapter extends RecyclerView.Adapter<OrgsItemViewHolder> {

    private int[] orgsImages;
    private String[] orgsNames;
    private String[] orgsAddresses;
    private String[] orgsPhones;
    private String[] orgsEmails;
    private String[] orgsWebsites;

    public OrgsItemAdapter(int[] orgsImages, String[] orgsNames, String[] orgsAddresses, String[] orgsEmails, String[] orgsPhones, String[] orgsWebsites) {
        this.orgsImages = orgsImages;
        this.orgsNames = orgsNames;
        this.orgsAddresses = orgsAddresses;
        this.orgsPhones = orgsPhones;
        this.orgsEmails = orgsEmails;
        this.orgsWebsites = orgsWebsites;
    }

    @NonNull
    @Override
    public OrgsItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Make one "tile"; this will be called once per number of visible tiles on screen
        View itemView = LayoutInflater.from(
                parent.getContext()).inflate(R.layout.rv_item, parent, false);

        return new OrgsItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OrgsItemViewHolder holder, int position) {
        // Insert into this tile the image and name of the car we are up to
        holder.imageView.setImageResource(orgsImages[position]);
        holder.names.setText(orgsNames[position]);
        holder.address.setText(orgsAddresses[position]);
        holder.phone.setText(orgsPhones[position]);
        holder.email.setText(orgsEmails[position]);
        holder.website.setText(orgsWebsites[position]);
    }

    @Override
    public void onViewAttachedToWindow(@NonNull OrgsItemViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        animateCard(holder.cardView);
    }

    private void animateCard(CardView view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int centerX = 0, centerY = 0, startRadius = 0;
            int endRadius = Math.max(view.getWidth(), view.getHeight());
            Animator circularRevealAnimationOfCard = ViewAnimationUtils.createCircularReveal
                    (view, centerX, centerY, startRadius, endRadius);
            circularRevealAnimationOfCard.start();
        }
    }

    @Override
    public int getItemCount() {
        return orgsImages.length;
    }
}