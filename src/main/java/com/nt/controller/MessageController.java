package com.nt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

//	@GetMapping("/home/id={id}/name={name}/email={email}")
//	public Object home(@PathVariable("id") int id, @PathVariable("name") String name,
//			@PathVariable("email") String email) {
//		return id + "\t" + name + "\t" + email;
//	}

//	@GetMapping(value = "home")
//	public @ResponseBody Object home(@RequestParam("id") int id) {
//		return id; 
//	}

//	@RequestMapping(method = RequestMethod.GET, value = "/custom")
//    public String controllerMethod(@RequestParam Map<String, String> customQuery) {
//
//        System.out.println("customQuery = brand " + customQuery.containsKey("brand"));
//        System.out.println("customQuery = limit " + customQuery.containsKey("limit"));
//        System.out.println("customQuery = price " + customQuery.containsKey("price"));
//        System.out.println("customQuery = other " + customQuery.containsKey("other"));
//        System.out.println("customQuery = sort " + customQuery.containsKey("sort"));
//
//        return customQuery.toString();
//    }
//	

	@ResponseBody
	@GetMapping(value = "home",produces = "application/json")
	public List<Object> getBook(			
			@RequestParam(value = "id", defaultValue = "false") int id,
			@RequestParam(value = "name", defaultValue = "false") String name,
			@RequestParam(value = "email", defaultValue = "false") String email) throws Exception {

		return List.of(id, name, email);
		// logic
	}

//	@GetMapping("/home/id={id}/name={name}/email={email}")
//	public String index(@PathVariable("id") int id, @PathVariable("name") String name,@PathVariable("email") String email, Model model) {
//		
//		model.addAttribute("id", id);
//		model.addAttribute("name", name);
//		model.addAttribute("email",email);
//		
//		
//		return "home";
//	}
//	

}
