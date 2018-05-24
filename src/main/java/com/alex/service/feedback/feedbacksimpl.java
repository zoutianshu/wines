package com.alex.service.feedback;

import com.alex.entity.feedback.FeedbackInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("feedback")
public class feedbacksimpl implements feedbacks {
    @Autowired
    private com.alex.dao.feedback.feedbacks feedbacks;
    @Override
    public void insertFeedback(FeedbackInfo feedbackInfo) {
        feedbacks.insertFeedback(feedbackInfo);
    }
}
