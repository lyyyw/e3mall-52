package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 商品管理controller
 * @author Administrator
 *
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemid}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemid){
		TbItem tbItem = itemService.getItemById(itemid);
		return tbItem;
	}
}
