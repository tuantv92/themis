package com.themis.rbac.entity.impl;

import java.util.Collection;
import java.util.HashSet;

import com.themis.rbac.Permission;
import com.themis.rbac.entity.RBACRole;

public abstract class AbstractRBACRole implements RBACRole {

	private final Collection<Permission> permissions = new HashSet<>();

	@Override
	public Collection<Permission> getPermissions() {
		return this.permissions;
	}

}
