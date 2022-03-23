package com.example.mapstruct.springmapstructdemo.mapper;

import com.example.mapstruct.springmapstructdemo.dto.ProductDto;
import com.example.mapstruct.springmapstructdemo.model.Product;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring",imports = UUID.class)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "product.desc", target = "description", defaultValue = "description par defaut")
     ProductDto modelToDto(Product product);

    List<ProductDto> modelToDtos(List<Product> product);


    @InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto);

    /*
    @Named ( value = "decodeIntToStrCivilite")
    public static String toto(int intCivil) {

        String retStr = "Non defini";

        switch (intCivil) {
            case 1: retStr = "Monsieur";
                    break;
            case 2: retStr = "Monsieur";
                    break;
        }
        return  retStr;
    }


     */

}
