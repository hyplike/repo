package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

public interface BrandService {
	/**
	 * 查询所有品牌
	 * 
	 * @author
	 *
	 */
	public List<TbBrand> findAll();
    /**
     * 分页
     * @param pageNum
     * @param pageSize
     * @return
     */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 添加品牌
	 */
    public void add(TbBrand tbBrand);
    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    public TbBrand findOne(long id);
    
    /**
     * 修改品牌
     * @param tbBrand
     */
    public void update(TbBrand tbBrand);
    
    
    /**
     * 删除品牌
     * @param id
     */
    
    
    public void delete(long[] ids);
    
    
    /**
     * 根据条件查询品牌
     * @param tbBrand
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(TbBrand tbBrand,int pageNum,int pageSize);
    
    
	/**
	 * 品牌下拉数据
	 * @return
	 */
    List<Map> selectOptionList(); 
	
    
}
