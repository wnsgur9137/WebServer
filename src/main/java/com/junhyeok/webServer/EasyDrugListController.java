package com.junhyeok.webServer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.junhyeok.domain.EasyDrugListVO;
import com.junhyeok.service.EasyDrugListService;



//@Controller
@RestController
@RequestMapping("/EasyDrugList/*")
public class EasyDrugListController {
	
	@Inject
	private EasyDrugListService service;
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public @ResponseBody Object read(@RequestParam("drugName") String drugName) throws Exception {
		EasyDrugListVO vo = service.read(drugName);
		return vo;
	}
	
	@RequestMapping(value = "/readList", method = RequestMethod.GET)
	public @ResponseBody Object readList(@RequestParam("drugName") String drugName) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("drugList", service.readList(drugName));
		return map;
	}
	
//	@GetMapping("/getParameter")
//	public EasyDrugListVO getParameter(EasyDrugListVO vo) {
//		System.out.println(vo.getDurgName());
//		System.out.println(vo.getDrugImage());
//		return vo;
//	}
	
	
//	@RequestMapping(value = "/modify", method = RequestMethod.GET)
//	  public @ResponseBody Object modifyPOST(EasyDrugListVO board) throws Exception {
//	    EasyDrugListVO vo = service.modify(board);
//	    return vo;
//	  }

}