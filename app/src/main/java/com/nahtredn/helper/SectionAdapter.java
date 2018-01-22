package com.nahtredn.helper;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nahtredn.adso.MainActivity;
import com.nahtredn.adso.R;
import com.nahtredn.entities.Section;

import java.util.List;

/**
 * Created by Me on 21/01/2018.
 */

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.SectionViewHolder> {
    private List<Section> sections;

    public SectionAdapter(List<Section> sections){
        this.sections = sections;
    }

    @Override
    public SectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_section, parent, false);
        return new SectionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SectionViewHolder holder, final int position) {
        holder.title.setText(sections.get(position).getTitle());
        holder.description.setText(sections.get(position).getDescription());
        holder.imageSection.setImageResource(sections.get(position).getId());
        holder.buttonSection.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sections.get(position).getContext(), sections.get(position).getEndActivity());
                sections.get(position).getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sections.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class SectionViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView title;
        TextView description;
        ImageView imageSection;
        Button buttonSection;

        SectionViewHolder(View itemView){
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.section_card_view);
            title = (TextView) itemView.findViewById(R.id.section_title);
            description = (TextView) itemView.findViewById(R.id.section_description);
            imageSection = (ImageView) itemView.findViewById(R.id.section_photo);
            buttonSection = (Button) itemView.findViewById(R.id.btn_section_action);
        }
    }
}
