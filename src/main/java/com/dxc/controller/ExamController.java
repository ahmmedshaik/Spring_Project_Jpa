package com.dxc.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Exam;
import com.dxc.dao.ExamRepository;

@Controller
public class ExamController {
	
	@Autowired
	ExamRepository examRepository;
	
	@RequestMapping("examdisplay")
	public ModelAndView displayexams(){
		ModelAndView modelAndView=new ModelAndView("examdisplay");
		List<Exam> exams=(List<Exam>)examRepository.findAll(); 
		modelAndView.addObject("exam",exams);
		return modelAndView;
	}
	
	@RequestMapping("addExam")
	public String newexamform()
	{
		return "addExam";
	}
	
	@RequestMapping("esave")
	public String addExam(@RequestParam("id") String id,@RequestParam("name") String name) throws ParseException
	{
		Exam exam=new Exam(id, name);
		examRepository.save(exam);
		return "redirect:/examdisplay";
	}
	
	@RequestMapping("examEdit")
	public String editstudentform()
	{
		return "examEdit";
	}
	
	@RequestMapping("eupdate")
	public String updateExam(@RequestParam("id") String id,@RequestParam("name") String name) throws ParseException
	{
		Exam exam=new Exam(id, name);
		examRepository.save(exam);
		return "redirect:/examdisplay";
	}
	
	@RequestMapping("examdelete")
	public String deleteStudent(@RequestParam("id") String id)
	{
		examRepository.deleteById(id);
		return "redirect:/examdisplay";
	}
	
}
