package com.server.InvestiMate.api.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleType {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");
    private final String key;
}