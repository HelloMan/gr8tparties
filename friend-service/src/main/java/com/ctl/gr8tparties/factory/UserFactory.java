package com.ctl.gr8tparties.factory;

import com.ctl.gr8tparties.FriendDto;
import com.ctl.gr8tparties.model.User;

/**
 * Created by Cesar on 15/01/2017.
 */
public final class UserFactory {
    private UserFactory() {
    }

    public static User fromDto(FriendDto.UserDto userDto){
        final User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setId(userDto.getUserId());
        return user;
    }

    public static FriendDto.UserDto toDto(User user){
        return FriendDto.UserDto.newBuilder()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setUserId(user.getId())
                .build();
    }
}
