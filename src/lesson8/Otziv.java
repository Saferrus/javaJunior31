package lesson8;

import java.util.Date;

public class Otziv {
   private User user;
   private Date date;
   private int reit;
   private String description;
   private int like;
   private int disLike;

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public int getReit() {
      return reit;
   }

   public void setReit(int reit) {
      this.reit = reit;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getLike() {
      return like;
   }

   public void setLike(int like) {
      this.like = like;
   }

   public int getDisLike() {
      return disLike;
   }

   public void setDisLike(int disLike) {
      this.disLike = disLike;
   }
}
