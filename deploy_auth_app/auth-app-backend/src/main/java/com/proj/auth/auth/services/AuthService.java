package com.proj.auth.auth.services;

import com.proj.auth.auth.payload.UserDto;

public interface AuthService {

    UserDto registerUser(UserDto userDto);

}
