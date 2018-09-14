package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import org.aspectj.weaver.VersionedDataInputStream;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService brandService;

	/**
	 * 查询所有品牌
	 * 
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbBrand> findAll() {
		return brandService.findAll();
	}

	/**
	 * 分页
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows) {

		return brandService.findPage(page, rows);
	}
	/**
	 * 保存品牌
	 * @param tbBrand
	 * @return
	 */
	@RequestMapping("/add")
	public Result  add(@RequestBody TbBrand tbBrand) {
		try {
			brandService.add(tbBrand);
			return new Result(true,"添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"添加失败");
		}
		
	}
	
	/**
	 * 根据id查询品牌
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbBrand findOne(long id) {
		
		return brandService.findOne(id);
	}
	
	/**
	 * 修改品牌
	 * @param tbBrand
	 * @return
	 */
	@RequestMapping("/update")
	public Result  update(@RequestBody TbBrand tbBrand) {
		try {
			brandService.update(tbBrand);
			return new Result(true,"修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
		
	}
	/**
	 * 删除品牌
	 * @param id
	 */
	@RequestMapping("/delete")
	public Result delete(long[] ids) {
		try {
			brandService.delete(ids);
			return new Result(true,"删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"删除失败");
		}
	}
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBrand tbBrand,int page,int rows) {
		return brandService.findPage(tbBrand, page, rows);
				
	}
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList(){ 
		
		return brandService.selectOptionList();
	}
	
	
}
