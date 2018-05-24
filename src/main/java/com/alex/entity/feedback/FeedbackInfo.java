package com.alex.entity.feedback;

public class FeedbackInfo {
      private long user_account;
      private String user_id;
      private String user_nickname;
      private String user_problem;
      private String user_name;
      private long user_number;
      private String problem_method;
      public FeedbackInfo(){}
      public FeedbackInfo(long user_account,String user_id,String user_nickname,String user_problem,String user_name,long user_number,String problem_method){
          this.user_account=user_account;
          this.user_id=user_id;
          this.user_nickname=user_nickname;
          this.user_name=user_name;
          this.user_problem=user_problem;
          this.user_number=user_number;
          this.problem_method=problem_method;
      }

    public void setUser_account(long user_account) {
        this.user_account = user_account;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setProblem_method(String problem_method) {
        this.problem_method = problem_method;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public void setUser_number(long user_number) {
        this.user_number = user_number;
    }

    public void setUser_problem(String user_problem) {
        this.user_problem = user_problem;
    }

    public long getUser_account() {
        return user_account;
    }

    public String getUser_id() {
        return user_id;
    }

    public long getUser_number() {
        return user_number;
    }

    public String getProblem_method() {
        return problem_method;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public String getUser_problem() {
        return user_problem;
    }
}
