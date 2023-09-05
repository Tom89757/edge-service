package com.polarbookshop.edgeservice.user;

import java.util.List;

/**
 * @author Tom89757
 */
public record User(
        String username,
        String firstName,
        String lastName,
        List<String> roles
) {
}
