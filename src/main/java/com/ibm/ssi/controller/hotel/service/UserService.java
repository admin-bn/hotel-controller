/*
 * Copyright 2021 Bundesreplublik Deutschland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.ssi.controller.hotel.service;

import java.util.List;
import java.util.Optional;

import com.ibm.ssi.controller.hotel.service.dto.UserCreationDTO;
import com.ibm.ssi.controller.hotel.service.dto.UserDTO;
import com.ibm.ssi.controller.hotel.service.exceptions.HotelNotFoundException;
import com.ibm.ssi.controller.hotel.service.exceptions.UserAlreadyExistsException;
import com.ibm.ssi.controller.hotel.service.exceptions.UserNotFoundException;
import com.ibm.ssi.controller.hotel.service.exceptions.UserWithLoginAlreadyExists;

public interface UserService {

    public UserDTO createUser(UserCreationDTO userDTO) throws UserAlreadyExistsException, HotelNotFoundException;

    UserDTO updateUser(UserDTO userDto) throws UserNotFoundException, UserWithLoginAlreadyExists, HotelNotFoundException;

    List<UserDTO> getAllUsers();

    Optional<UserDTO> getUser(String id);

    void deleteUser(String id);
}
