package com.wantdo.erp.mapper;

import com.wantdo.erp.model.ProductVariants;

public interface ProductVariantsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_variants
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_variants
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    int insert(ProductVariants record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_variants
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    int insertSelective(ProductVariants record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_variants
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    ProductVariants selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_variants
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    int updateByPrimaryKeySelective(ProductVariants record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_variants
     *
     * @mbggenerated Mon Apr 04 14:25:52 CST 2016
     */
    int updateByPrimaryKey(ProductVariants record);
}