package com.aashraf.nytimesjava.presentation.views;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.aashraf.nytimesjava.R;
import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.Intrinsics;


public final class DetailsActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_details);
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.getData();
    }

    public boolean onSupportNavigateUp() {
        this.onBackPressed();
        return true;
    }

    private final void getData() {
        Intent intent = this.getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (intent.getExtras() != null) {
            String title = intent.getStringExtra("title");
            String description = intent.getStringExtra("des");
            this.bindData(description, title);
        }
    }

    private final void bindData(String description, String title) {
        TextView descriptionTextView=this.findViewById(R.id.tv_details_description);
        descriptionTextView.setText(description);
        TextView titleTextView = this.findViewById(R.id.tv_details_title);
        titleTextView.setText(title);
    }
}
