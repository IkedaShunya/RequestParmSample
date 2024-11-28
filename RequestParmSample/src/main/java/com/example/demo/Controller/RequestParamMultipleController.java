package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SampleForm;

@Controller
public class RequestParamMultipleController {


	//GETかつ[url:/multiple]
	@GetMapping("multiple")
	public String showView() {
		return "entry";
	}

	
//	@PostMapping("confirm")
//	//name属性と同名を指定することで
//	//@RequewstParamの後の変数に名前が設定される
//	public String confirmVie(Model model, 
//			@RequestParam String name, @RequestParam Integer age,
//			@DateTimeFormat(iso =DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth
//			) {
//		model.addAttribute("name",name);
//		model.addAttribute("age", age);
//		model.addAttribute("birth", birth);
//
//		return "confirm";
//
//	}
	
	@PostMapping("confirm")
	public String confirmView(SampleForm f) {
		//戻り値は「ビュー名」を返す
		return "confirm2";
		
	}
	

}
