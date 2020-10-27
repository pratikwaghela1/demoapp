package com.pc.demos.mapstructdemo.mapper;

import com.pc.demos.mapstructdemo.domain.Category;
import com.pc.demos.mapstructdemo.domain.Category.CategoryBuilder;
import com.pc.demos.mapstructdemo.domain.Product;
import com.pc.demos.mapstructdemo.domain.Product.ProductBuilder;
import com.pc.demos.mapstructdemo.models.CategoryRequest;
import com.pc.demos.mapstructdemo.models.ProductRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-27T08:05:21+0530",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.6.1.jar, environment: Java 11.0.9 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productRequestToProduct(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( productRequest.getId() );
        product.name( productRequest.getName() );
        product.categories( categoryRequestListToCategoryList( productRequest.getCategories() ) );

        return product.build();
    }

    protected Category categoryRequestToCategory(CategoryRequest categoryRequest) {
        if ( categoryRequest == null ) {
            return null;
        }

        CategoryBuilder category = Category.builder();

        category.id( categoryRequest.getId() );
        category.name( categoryRequest.getName() );

        return category.build();
    }

    protected List<Category> categoryRequestListToCategoryList(List<CategoryRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<Category> list1 = new ArrayList<Category>( list.size() );
        for ( CategoryRequest categoryRequest : list ) {
            list1.add( categoryRequestToCategory( categoryRequest ) );
        }

        return list1;
    }
}
