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

import com.junhyeok.domain.MedicineListVO;
import com.junhyeok.service.MedicineListService;

@RestController
@RequestMapping("/MedicineList/*")
public class MedicineListController {
	
	@Inject
	private MedicineListService service;
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public @ResponseBody Object read(@RequestParam("medicineName") String medicineName) throws Exception {
		MedicineListVO vo = service.read(medicineName);
		return vo;
	}
	
	@RequestMapping(value = "/readList", method = RequestMethod.GET)
	public @ResponseBody Object readList(@RequestParam("medicineName") String medicineName) throws Exception {
//		List<MedicineListVO> vo = service.readList(medicineName);
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("medicineList", service.readList(medicineName));
		return map;
	}
	
	@RequestMapping(value = "/readParam", method = RequestMethod.GET)
	public @ResponseBody Object readParam(@RequestParam("medicineShape") String medicineShape,
											@RequestParam("printFront") String printFront,
											@RequestParam("colorClass") String colorClass,
											@RequestParam("lineFront") String lineFront) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("medicineList", service.readParam(medicineShape, printFront, colorClass, lineFront));
		return map;
	}
}
