package com.example.sqltest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder{

    TextView tvName, tvPhoneNum;
    ImageView deleteContact;
    ImageView editContact;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.contactName);
        tvPhoneNum = itemView.findViewById(R.id.phoneNum);
        deleteContact = itemView.findViewById(R.id.deleteContact);
        editContact = itemView.findViewById(R.id.editContact);

    }
}
