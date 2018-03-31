package com.javalanguagezone.interviewtwitter.service.dto;

import com.javalanguagezone.interviewtwitter.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
public class UserDTO {
  private Long id;
  private String username;
  private String firstName;
  private String lastName;
  private Integer numberOfTweets;
  private Integer numberOfFollowers;
  private Integer numberOfUsersFollowing;

  public UserDTO(User user) {
    this.id = user.getId();
    this.username = user.getUsername();
  }

  public UserDTO(User user, Integer numberOfTweets) {
    this.id = user.getId();
    this.username = user.getUsername();
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName();
    this.numberOfFollowers = user.getFollowers().size();
    this.numberOfUsersFollowing = user.getFollowing().size();
    this.numberOfTweets = numberOfTweets;
  }
}
