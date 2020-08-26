package com.applications.longdomconferences.listener;


import com.applications.longdomconferences.models.Categories;

public interface CatClickListener1 {

    void onAddClick(int position, Categories categories);
    void onRemoveClick(int position, Categories categories);

}
