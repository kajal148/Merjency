package com.kajal.merjency;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HospitalAdapterClass extends RecyclerView.Adapter<HospitalAdapterClass.MyViewHolder> {

    private Context context;
    private List<Hospital> mHospital;

    public HospitalAdapterClass(Context context, List<Hospital> mServices) {
        this.context = context;
        this.mHospital= mHospital;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mName,mAddress,mDistance;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mName = itemView.findViewById(R.id.hospital_name);
            mAddress = itemView.findViewById(R.id.hospital_address);
            mDistance = itemView.findViewById(R.id.hospital_distance);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.hospital, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Hospital text = mHospital.get(position);

        holder.mName.setText(text.getName());
        holder.mAddress.setText(text.getAddress());
        holder.mDistance.setText(text.getDistance());



    }

    @Override
    public int getItemCount() {
        return mHospital.size();
    }
}