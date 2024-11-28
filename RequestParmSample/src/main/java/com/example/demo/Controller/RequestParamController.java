package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

	//GETかつ[url:/show]
	@GetMapping("show")
	public String showView() {
		//表示する「ビュー名」
		return "input";
	}

	//GETかつ[url:/result]
	@GetMapping("result")
	public String showResultGet(
			@RequestParam String val,Model model) {
		//モデルに送られてきた値を設定
		model.addAttribute("value", val);
		return "output";
	}

	//POSTかつ[url:/result]
	@PostMapping("result")
	public String showResultPost(
			@RequestParam String val,Model model) {
		//モデルに送られてきた値を設定
		model.addAttribute("value", val);
		return "output";
	}

}
