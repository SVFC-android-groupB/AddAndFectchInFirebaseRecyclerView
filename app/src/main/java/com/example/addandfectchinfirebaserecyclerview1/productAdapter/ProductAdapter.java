package com.example.addandfectchinfirebaserecyclerview1.productAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.addandfectchinfirebaserecyclerview1.R;
import com.example.addandfectchinfirebaserecyclerview1.productModel.ProductModel;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productViewHolder> {

    List<ProductModel> productModelList;

    public ProductAdapter(List<ProductModel> productModelList) {
        this.productModelList = productModelList;
    }


    @NonNull
    @Override
    public ProductAdapter.productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.product_card, parent, false);
        return new productViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.productViewHolder holder, int position) {
        ProductModel productModel = productModelList.get(position);
        holder.productName.setText(productModel.getName());
        holder.productCategory.setText(productModel.getCategory());
        holder.productPrice.setText(String.valueOf(productModel.getPrice()));
    }


    @Override
    public int getItemCount() {
        return productModelList.size();
    }


    public static class productViewHolder extends RecyclerView.ViewHolder {
        TextView productName, productCategory, productPrice;
        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.tv_product_name);
            productCategory = itemView.findViewById(R.id.tv_product_category);
            productPrice = itemView.findViewById(R.id.tv_product_price);
            }
        }
    }
