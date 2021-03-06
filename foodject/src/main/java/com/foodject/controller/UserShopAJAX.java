package com.foodject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodject.biz.UserCartBiz;
import com.foodject.biz.UserOptcartBiz;
import com.foodject.vo.UserCartVO;
import com.foodject.vo.UserOptcartVO;

@RestController
@RequestMapping("/shop/main")
public class UserShopAJAX {
	
	@Autowired
	UserCartBiz crbiz;
	
	@Autowired
	UserOptcartBiz opbiz;
	
	@RequestMapping("/addCart")
	public Object addCart(String uid, int mnid, int num) {
		int cartId = 0;	
		
		UserCartVO obj = null;
		UserCartVO OFI = new UserCartVO(uid, mnid);
		List<UserOptcartVO> oclist = null;
		try {
			// selectForInsert 해보고,
			obj = crbiz.getForInsert(OFI);
			// if) 일치하는 거 있으면, 일단 .getId() 
			if(obj != null) {
				cartId = obj.getId();
				// optcart도 cartId로 select 해서,
				oclist = opbiz.get_byCtid(cartId);
				
				// if) 해당 cartId에 optcart항목이 존재하면
				if(oclist != null) {
				//새로운 cartId로 추가.
					crbiz.register(new UserCartVO(uid,mnid,num));
				}
				// else) 옵션 없으면 num랑 더한 값으로 updateNum 해주고, 
				else {
					crbiz.modify(new UserCartVO(cartId,obj.getNum()+num));
				}
			}else {
			// else) 일치하는 거 없으면 새로 추가한 후 .getId() 가져옴.
				crbiz.register(new UserCartVO(uid,mnid,num));
				obj = crbiz.getForInsert(OFI);
				cartId = obj.getId();
			}
			//if end

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cartId;
	}
}