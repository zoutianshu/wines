package com.alex.controller.feedback;

import com.alex.entity.feedback.FeedbackInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class FeedbackController {
    @Resource(name = "feedback")
    com.alex.service.feedback.feedbacks feedbacks;
    @RequestMapping(value = "/feedback",method = RequestMethod.POST)
    @ResponseBody
    public void feedback(@RequestBody FeedbackInfo feedbackInfo){
     feedbacks.insertFeedback(feedbackInfo);
    }
}
