package com.imen.gestionStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imen.gestionStock.model.Category;
import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;


import java.util.List;
@Data
@Builder
public class CategoryDto {
    private Integer id;

    private  String code;
    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
       if(category == null) {
           return null;
           //TODO throw an exception

       }

       return CategoryDto.builder()
               .id(category.getId())
               .code(category.getCode())
               .designation(category.getDesignation())
               .build();
    }


}
