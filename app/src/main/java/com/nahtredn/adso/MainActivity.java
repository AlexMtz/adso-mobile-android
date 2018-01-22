package com.nahtredn.adso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nahtredn.entities.Section;
import com.nahtredn.helper.SectionAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SectionAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.section_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new SectionAdapter(initializeData());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Section> initializeData(){
        ArrayList<Section> sections = new ArrayList<Section>();
        sections.add(new Section(getString(R.string.general_section), getString(R.string.general_description_section), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        sections.add(new Section(getString(R.string.documentation_section), getString(R.string.documentation_description_section), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        sections.add(new Section(getString(R.string.studies_section), getString(R.string.studies_descripcion_section), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        sections.add(new Section(getString(R.string.current_studies_section), getString(R.string.current_studies_description_section), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        sections.add(new Section(getString(R.string.knowledge_skills_sections), getString(R.string.knowledge_skills_description_sections), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        sections.add(new Section(getString(R.string.job_experience_section), getString(R.string.job_experience_description_section), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        sections.add(new Section(getString(R.string.reference_section), getString(R.string.reference_description_section), R.drawable.ic_launcher_foreground, this, GeneralActivity.class));
        return sections;
    }
}
